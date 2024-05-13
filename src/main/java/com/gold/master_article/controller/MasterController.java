package com.gold.master_article.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gold.master_article.oracle.service.MasterService;

@CrossOrigin
@RestController
@RequestMapping("/Master")
public class MasterController {
    @Autowired
    MasterService masterService;

    @GetMapping("/getData")
    public ResponseEntity<Object> getData(){
        return masterService.getData();
    }
}
