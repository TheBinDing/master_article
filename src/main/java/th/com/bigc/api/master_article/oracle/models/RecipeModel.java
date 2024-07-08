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
    private String article_code;

    @Column(name = "bar_code")
    private String bar_code;

    @Column(name = "sale_unit")
    private String sale_unit;

    @Column(name = "qty_coef")
    private String qty_coef;

    @Column(name = "bar_code_recipe_spack")
    private String bar_code_recipe_spack;

    public String getArticle_code() {
        return article_code;
    }

    public void setArticle_code(String article_code) {
        this.article_code = article_code;
    }

    public String getBar_code() {
        return bar_code;
    }

    public void setBar_code(String bar_code) {
        this.bar_code = bar_code;
    }

    public String getSale_unit() {
        return sale_unit;
    }

    public void setSale_unit(String sale_unit) {
        this.sale_unit = sale_unit;
    }

    public String getQty_coef() {
        return qty_coef;
    }

    public void setQty_coef(String qty_coef) {
        this.qty_coef = qty_coef;
    }

    public String getBar_code_recipe_spack() {
        return bar_code_recipe_spack;
    }

    public void setBar_code_recipe_spack(String bar_code_recipe_spack) {
        this.bar_code_recipe_spack = bar_code_recipe_spack;
    }
}
