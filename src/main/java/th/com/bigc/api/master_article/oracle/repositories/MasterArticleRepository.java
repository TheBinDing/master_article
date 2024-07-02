package th.com.bigc.api.master_article.oracle.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import th.com.bigc.api.master_article.oracle.models.MasterArticleModel;

public interface MasterArticleRepository extends JpaRepository<MasterArticleModel, Object> {
    
}
