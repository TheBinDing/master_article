package th.com.bigc.api.master_article.oracle.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "bgc_master_article")
public class RecipeModel {
    @Id
    @Column(name = "article_code")
    private String articleCode;

    @Column(name = "bar_code")
    private String barCode;

    @Column(name = "sale_unit")
    private String saleUnit;

    @Column(name = "qty_coef")
    private int qtyCoef;

    @Column(name = "bar_code_recipe_spack")
    private String barCodeRecipeSpack;

    public String getArticleCode() {
        return articleCode;
    }

    public void setArticleCode(String articleCode) {
        this.articleCode = articleCode;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public String getSaleUnit() {
        return saleUnit;
    }

    public void setSaleUnit(String saleUnit) {
        this.saleUnit = saleUnit;
    }

    public int getQtyCoef() {
        return qtyCoef;
    }

    public void setQtyCoef(int qtyCoef) {
        this.qtyCoef = qtyCoef;
    }

    public String getBarCodeRecipeSpack() {
        return barCodeRecipeSpack;
    }

    public void setBarCodeRecipeSpack(String barCodeRecipeSpack) {
        this.barCodeRecipeSpack = barCodeRecipeSpack;
    }

}
