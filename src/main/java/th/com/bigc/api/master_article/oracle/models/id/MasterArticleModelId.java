package th.com.bigc.api.master_article.oracle.models.id;

import java.io.Serializable;

public class MasterArticleModelId implements Serializable {
    private String division_code;
    private String bar_code;
    private String product_name_th;
    
    public MasterArticleModelId() {
    }

    public MasterArticleModelId(String division_code, String bar_code, String product_name_th) {
        this.division_code = division_code;
        this.bar_code = bar_code;
        this.product_name_th = product_name_th;
    }
}
