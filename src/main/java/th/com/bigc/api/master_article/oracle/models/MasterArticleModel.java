package th.com.bigc.api.master_article.oracle.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import th.com.bigc.api.master_article.oracle.models.id.MasterArticleModelId;

@Entity
@Table(name = "bgc_master_article", uniqueConstraints = @UniqueConstraint(columnNames = { "division_code", "bar_code", "product_name_th" }))
@IdClass(MasterArticleModelId.class)
public class MasterArticleModel {
    @Id
    @Column(name = "division_code")
    private String division_code;

    @Column(name = "division_name")
    private String division_name;

    @Column(name = "department_code")
    private String department_code;

    @Column(name = "department_name")
    private String department_name;

    @Column(name = "sub_department_code")
    private String sub_department_code;

    @Column(name = "sub_department_name")
    private String sub_department_name;

    @Column(name = "class_code")
    private String class_code;

    @Column(name = "class_name")
    private String class_name;

    @Column(name = "sub_class_code")
    private String sub_class_code;

    @Column(name = "sub_class_name")
    private String sub_class_name;

    @Column(name = "article_code")
    private String article_code;

    @Id
    @Column(name = "bar_code")
    private String bar_code;

    @Id
    @Column(name = "product_name_th")
    private String product_name_th;

    @Column(name = "product_name_en")
    private String product_name_en;

    @Column(name = "sale_unit")
    private String sale_unit;

    @Column(name = "model")
    private String model;

    @Column(name = "brand")
    private String brand;

    @Column(name = "sv_status")
    private String sv_status;

    @Column(name = "lv_status")
    private String lv_status;

    @Column(name = "flag_print")
    private String flag_print;

    public String getDivision_code() {
        return division_code;
    }

    public void setDivision_code(String division_code) {
        this.division_code = division_code;
    }

    public String getDivision_name() {
        return division_name;
    }

    public void setDivision_name(String division_name) {
        this.division_name = division_name;
    }

    public String getDepartment_code() {
        return department_code;
    }

    public void setDepartment_code(String department_code) {
        this.department_code = department_code;
    }

    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    public String getSub_department_code() {
        return sub_department_code;
    }

    public void setSub_department_code(String sub_department_code) {
        this.sub_department_code = sub_department_code;
    }

    public String getSub_department_name() {
        return sub_department_name;
    }

    public void setSub_department_name(String sub_department_name) {
        this.sub_department_name = sub_department_name;
    }

    public String getClass_code() {
        return class_code;
    }

    public void setClass_code(String class_code) {
        this.class_code = class_code;
    }

    public String getClass_name() {
        return class_name;
    }

    public void setClass_name(String class_name) {
        this.class_name = class_name;
    }

    public String getSub_class_code() {
        return sub_class_code;
    }

    public void setSub_class_code(String sub_class_code) {
        this.sub_class_code = sub_class_code;
    }

    public String getSub_class_name() {
        return sub_class_name;
    }

    public void setSub_class_name(String sub_class_name) {
        this.sub_class_name = sub_class_name;
    }

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

    public String getProduct_name_th() {
        return product_name_th;
    }

    public void setProduct_name_th(String product_name_th) {
        this.product_name_th = product_name_th;
    }

    public String getProduct_name_en() {
        return product_name_en;
    }

    public void setProduct_name_en(String product_name_en) {
        this.product_name_en = product_name_en;
    }

    public String getSale_unit() {
        return sale_unit;
    }

    public void setSale_unit(String sale_unit) {
        this.sale_unit = sale_unit;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSv_status() {
        return sv_status;
    }

    public void setSv_status(String sv_status) {
        this.sv_status = sv_status;
    }

    public String getLv_status() {
        return lv_status;
    }

    public void setLv_status(String lv_status) {
        this.lv_status = lv_status;
    }

    public String getFlag_print() {
        return flag_print;
    }

    public void setFlag_print(String flag_print) {
        this.flag_print = flag_print;
    }
}
