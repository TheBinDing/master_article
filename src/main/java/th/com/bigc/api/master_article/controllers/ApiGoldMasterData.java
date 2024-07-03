package th.com.bigc.api.master_article.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import th.com.bigc.api.master_article.oracle.services.ApiGoldMasterDataService;

@CrossOrigin
@RestController
@RequestMapping("/apiGoldMasterData")
public class ApiGoldMasterData {
    @Autowired
    private ApiGoldMasterDataService apiGoldMasterDataService;

    @GetMapping("/getArticleMaster")
    public ResponseEntity<Object> getArticleMaster(@RequestParam String division_code) {
        return apiGoldMasterDataService.getArticleMaster(division_code);
    }

    @GetMapping("/getRecipe")
    public ResponseEntity<Object> getRecipe(@RequestParam String division_code) {
        return apiGoldMasterDataService.getRecipe(division_code);
    }
}
