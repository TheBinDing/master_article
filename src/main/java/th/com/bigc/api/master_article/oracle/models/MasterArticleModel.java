package th.com.bigc.api.master_article.oracle.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "bgc_master_article")
public class MasterArticleModel {
    @Id
    @Column(name = "division_code")
    private String divisionCode;

    @Column(name = "division_name")
    private String divisionName;

    @Column(name = "department_code")
    private String departmentCode;

    @Column(name = "department_name")
    private String departmentName;

    @Column(name = "sub_department_code")
    private String subDepartmentCode;

    @Column(name = "sub_department_name")
    private String subDepartmentName;

    @Column(name = "class_code")
    private String classCode;

    @Column(name = "class_name")
    private String className;

    @Column(name = "sub_class_code")
    private String subClassCode;

    @Column(name = "sub_class_name")
    private String subClassName;

    @Column(name = "article_code")
    private String articleCode;

    @Column(name = "bar_code")
    private String barCode;

    @Column(name = "product_name_th")
    private String productNameTh;

    @Column(name = "product_name_en")
    private String productNameEn;

    @Column(name = "sale_unit")
    private String saleUnit;

    @Column(name = "model")
    private String model;

    @Column(name = "brand")
    private String brand;

    @Column(name = "sv_status")
    private String svStatus;

    @Column(name = "lv_status")
    private String lvStatus;

    @Column(name = "flag_print")
    private String flagPrint;

    public String getDivisionCode() {
        return divisionCode;
    }

    public void setDivisionCode(String divisionCode) {
        this.divisionCode = divisionCode;
    }

    public String getDivisionName() {
        return divisionName;
    }

    public void setDivisionName(String divisionName) {
        this.divisionName = divisionName;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getSubDepartmentCode() {
        return subDepartmentCode;
    }

    public void setSubDepartmentCode(String subDepartmentCode) {
        this.subDepartmentCode = subDepartmentCode;
    }

    public String getSubDepartmentName() {
        return subDepartmentName;
    }

    public void setSubDepartmentName(String subDepartmentName) {
        this.subDepartmentName = subDepartmentName;
    }

    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getSubClassCode() {
        return subClassCode;
    }

    public void setSubClassCode(String subClassCode) {
        this.subClassCode = subClassCode;
    }

    public String getSubClassName() {
        return subClassName;
    }

    public void setSubClassName(String subClassName) {
        this.subClassName = subClassName;
    }

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

    public String getProductNameTh() {
        return productNameTh;
    }

    public void setProductNameTh(String productNameTh) {
        this.productNameTh = productNameTh;
    }

    public String getProductNameEn() {
        return productNameEn;
    }

    public void setProductNameEn(String productNameEn) {
        this.productNameEn = productNameEn;
    }

    public String getSaleUnit() {
        return saleUnit;
    }

    public void setSaleUnit(String saleUnit) {
        this.saleUnit = saleUnit;
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

    public String getSvStatus() {
        return svStatus;
    }

    public void setSvStatus(String svStatus) {
        this.svStatus = svStatus;
    }

    public String getLvStatus() {
        return lvStatus;
    }

    public void setLvStatus(String lvStatus) {
        this.lvStatus = lvStatus;
    }

    public String getFlagPrint() {
        return flagPrint;
    }

    public void setFlagPrint(String flagPrint) {
        this.flagPrint = flagPrint;
    }
}
