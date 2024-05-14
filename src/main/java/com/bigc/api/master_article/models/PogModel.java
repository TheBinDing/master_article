package com.bigc.api.master_article.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pog")
public class PogModel {
    @Id
    @Column(name = "str_no")
    private String strNo;

    @Column(name = "pda_id")
    private int pdaId;

    @Column(name = "faddr")
    private String faddr;

    public String getStrNo() {
        return strNo;
    }

    public void setStrNo(String strNo) {
        this.strNo = strNo;
    }

    public int getPdaId() {
        return pdaId;
    }

    public void setPdaId(int pdaId) {
        this.pdaId = pdaId;
    }

    public String getFaddr() {
        return faddr;
    }

    public void setFaddr(String faddr) {
        this.faddr = faddr;
    }
}
