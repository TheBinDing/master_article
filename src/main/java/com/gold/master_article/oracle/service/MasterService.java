package com.gold.master_article.oracle.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Component
public class MasterService {
    // @PersistenceContext
    // EntityManager em;

    // @Autowired
    // private BgcMasterArticleRepository bgcMasterArticleRepository;

    public ResponseEntity<Object> getData() {
        // List<BgcMasterArticleModel> data = bgcMasterArticleRepository.getMasterArticle();
        
        // return new ResponseEntity<Object>(data, HttpStatus.OK);
        return new ResponseEntity<Object>("test", HttpStatus.OK);
    }
    
}
