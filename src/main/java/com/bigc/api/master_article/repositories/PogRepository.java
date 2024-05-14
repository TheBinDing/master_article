package com.bigc.api.master_article.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bigc.api.master_article.models.PogModel;

public interface PogRepository extends JpaRepository<PogModel, String> {
    @Query(value = "select str_no, pda_id, faddr from pog", nativeQuery = true)
    List<PogModel> getData();
}
