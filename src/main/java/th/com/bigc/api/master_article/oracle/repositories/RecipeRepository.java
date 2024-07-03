package th.com.bigc.api.master_article.oracle.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import th.com.bigc.api.master_article.oracle.models.RecipeModel;

public interface RecipeRepository extends JpaRepository<RecipeModel, Object> {
    @Query(value = "select b.mst_article ARTICLE_CODE,a.mst_ingredient_bar BAR_CODE,REPLACE(b.mst_sku_unit,',',' ') SALE_UNIT, \r\n" + //
                " a.mst_recipe_qcoef QTY_COEF,a.mst_barcode BAR_CODE_RECIPE_SPACK \r\n" + //
                " from bgc_master_article a,bgc_master_article b,artcoca c  \r\n" + //
                " where a.mst_recipe_flag='Y' \r\n" + //
                " and sysdate between arcddeb and arcdfin \r\n" + //
                " and a.mst_ingredient_bar=c.arccode \r\n" + //
                " and c.arccinv=b.mst_cinv \r\n" + //
                " union \r\n" + //
                " select b.mst_article ARTICLE_CODE,a.mst_single_bar BAR_CODE,REPLACE(b.mst_sku_unit,',',' ') SALE_UNIT, \r\n" + //
                " a.mst_spack_qcoef QTY_COEF,a.mst_barcode BAR_CODE_RECIPE_SPACK \r\n" + //
                " from bgc_master_article a,bgc_master_article b,artcoca c \r\n" + //
                " where a.mst_spack_flag='Y' \r\n" + //
                " and sysdate between arcddeb and arcdfin \r\n" + //
                " and a.mst_single_bar=c.arccode \r\n" + //
                " and c.arccinv=b.mst_cinv", nativeQuery = true)
    List<RecipeModel> getRecipe();

    @Query(value = "select b.mst_article ARTICLE_CODE,a.mst_ingredient_bar BAR_CODE,REPLACE(b.mst_sku_unit,',',' ') SALE_UNIT, \r\n" + //
                " a.mst_recipe_qcoef QTY_COEF,a.mst_barcode BAR_CODE_RECIPE_SPACK \r\n" + //
                " from bgc_master_article a,bgc_master_article b,artcoca c  \r\n" + //
                " where a.mst_recipe_flag='Y'\r\n" + //
                " and a.mst_div = ?1\r\n" + //
                " and sysdate between arcddeb and arcdfin \r\n" + //
                " and a.mst_ingredient_bar=c.arccode \r\n" + //
                " and c.arccinv=b.mst_cinv \r\n" + //
                " union \r\n" + //
                " select b.mst_article ARTICLE_CODE,a.mst_single_bar BAR_CODE,REPLACE(b.mst_sku_unit,',',' ') SALE_UNIT, \r\n" + //
                " a.mst_spack_qcoef QTY_COEF,a.mst_barcode BAR_CODE_RECIPE_SPACK \r\n" + //
                " from bgc_master_article a,bgc_master_article b,artcoca c \r\n" + //
                " where a.mst_spack_flag='Y'\r\n" + //
                " and a.mst_div = ?1\r\n" + //
                " and sysdate between arcddeb and arcdfin \r\n" + //
                " and a.mst_single_bar=c.arccode \r\n" + //
                " and c.arccinv=b.mst_cinv", nativeQuery = true)
    List<RecipeModel> getRecipeByCode(String divisionCode);
}
