package com.bigc.api.master_article.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.bigc.api.master_article.models.PogModel;
import com.bigc.api.master_article.repositories.PogRepository;

@Service
public class MasterArticleService {
    @Autowired
    private PogRepository pogRepository;

    public ResponseEntity<Object> getData() {
        // List<PogModel> data = pogRepository.getData();
        return new ResponseEntity<Object>("test", HttpStatus.OK);
    }
    
}
