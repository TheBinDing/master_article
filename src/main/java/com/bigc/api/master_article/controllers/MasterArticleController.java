package com.bigc.api.master_article.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bigc.api.master_article.services.MasterArticleService;

@CrossOrigin
@RestController
@RequestMapping("/master_article")
public class MasterArticleController {
    @Autowired
    private MasterArticleService masterArticleService;

    @GetMapping("/getData")
    public ResponseEntity<Object> getData() {
        return masterArticleService.getData();
    }
}
