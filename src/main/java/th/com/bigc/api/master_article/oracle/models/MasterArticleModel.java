package th.com.bigc.api.master_article.oracle.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "bgc_master_article")
public class MasterArticleModel {
    @Id
    @Column(name = "MST_DIV")
    private String mstDiv;

    @Column(name = "MST_DIV_NAME")
    private String mstDivName;

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
}
