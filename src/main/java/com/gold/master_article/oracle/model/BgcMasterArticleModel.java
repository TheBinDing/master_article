package com.gold.master_article.oracle.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "bgc_master_article")
public class BgcMasterArticleModel {
    
    @Column(name = "MST_DIV")
    private String mstDiv;

    @Column(name = "MST_DIV_NAME")
    private String mstDivName;

    @Column(name = "MST_DEPT")
    private String mstDept;

    @Column(name = "MST_DEPT_NAME")
    private String mstDeptName;

    public String getMstDiv() {
        return mstDiv;
    }

    public void setMstDiv(String mstDiv) {
        this.mstDiv = mstDiv;
    }

    public String getMstDivName() {
        return mstDivName;
    }

    public void setMstDivName(String mstDivName) {
        this.mstDivName = mstDivName;
    }

    public String getMstDept() {
        return mstDept;
    }

    public void setMstDept(String mstDept) {
        this.mstDept = mstDept;
    }

    public String getMstDeptName() {
        return mstDeptName;
    }

    public void setMstDeptName(String mstDeptName) {
        this.mstDeptName = mstDeptName;
    }
}
