package com.gold.master_article.oracle.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.gold.master_article.oracle.model.BgcMasterArticleModel;

import jakarta.transaction.Transactional;

@Transactional
public interface BgcMasterArticleRepository extends JpaRepository<BgcMasterArticleModel, String> {
    @Query(value = "select mst_div, mst_div_name, mst_dept, mst_dept_name from bgc_master_article", nativeQuery = true)
    List<BgcMasterArticleModel> getMasterArticle();
}
