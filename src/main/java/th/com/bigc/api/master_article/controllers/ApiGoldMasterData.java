package th.com.bigc.api.master_article.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import th.com.bigc.api.master_article.models.ArticleMaster;
import th.com.bigc.api.master_article.oracle.services.ApiGoldMasterDataService;

@CrossOrigin
@RestController
@RequestMapping("/apiGoldMasterData")
public class ApiGoldMasterData {
    @Autowired
    private ApiGoldMasterDataService apiGoldMasterDataService;

    @GetMapping("/getArticleMaster")
    public ResponseEntity<Object> getArticleMaster(@RequestBody ArticleMaster articleMaster) {
        return apiGoldMasterDataService.getArticleMaster(articleMaster);
    }

    @GetMapping("/getRecipe")
    public ResponseEntity<Object> getRecipe(@RequestBody ArticleMaster articleMaster) {
        return apiGoldMasterDataService.getRecipe(articleMaster);
    }
}
