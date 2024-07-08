package th.com.bigc.api.master_article.oracle.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import th.com.bigc.api.master_article.oracle.models.MasterArticleModel;

public interface MasterArticleRepository extends JpaRepository<MasterArticleModel, Object> {
    @Query(value = "select mst_div division_code,mst_div_name division_name,mst_dept department_code,mst_dept_name department_name, mst_sdept sub_department_code,mst_sdept_name sub_department_name, mst_class class_code,mst_class_name class_name,mst_sclass sub_class_code,mst_sclass_name sub_class_name, mst_article ARTICLE_CODE,mst_barcode BAR_CODE, REPLACE(mst_libl_th,',',' ') PRODUCT_NAME_TH, REPLACE(mst_libl_en,',',' ') PRODUCT_NAME_EN, REPLACE(mst_sku_unit,',',' ') SALE_UNIT,REPLACE(mst_model,',',' ') model, REPLACE(mst_brand,',',' ') brand, decode(mst_sv_status,1,'A',2,'F',3,'D') SV_STATUS, decode(mst_lv_status,1,'A',2,'F',3,'D') LV_STATUS, decode(mst_div||mst_dept,'0610','Y','N') FLAG_PRINT from bgc_master_article ", nativeQuery = true)
    List<MasterArticleModel> getArticleMaster();

    @Query(value = "select mst_div division_code,mst_div_name division_name,mst_dept department_code,mst_dept_name department_name, mst_sdept sub_department_code,mst_sdept_name sub_department_name, mst_class class_code,mst_class_name class_name,mst_sclass sub_class_code,mst_sclass_name sub_class_name, mst_article ARTICLE_CODE,mst_barcode BAR_CODE, REPLACE(mst_libl_th,',',' ') PRODUCT_NAME_TH, REPLACE(mst_libl_en,',',' ') PRODUCT_NAME_EN, REPLACE(mst_sku_unit,',',' ') SALE_UNIT,REPLACE(mst_model,',',' ') model, REPLACE(mst_brand,',',' ') brand, decode(mst_sv_status,1,'A',2,'F',3,'D') SV_STATUS, decode(mst_lv_status,1,'A',2,'F',3,'D') LV_STATUS, decode(mst_div||mst_dept,'0610','Y','N') FLAG_PRINT from bgc_master_article where mst_div = ?1", nativeQuery = true)
    List<MasterArticleModel> getArticleMasterByCode(String divisionCode);
}
