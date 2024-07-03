package th.com.bigc.api.master_article.oracle.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import th.com.bigc.api.master_article.models.ArticleMaster;
import th.com.bigc.api.master_article.oracle.models.MasterArticleModel;
import th.com.bigc.api.master_article.oracle.models.RecipeModel;
import th.com.bigc.api.master_article.oracle.repositories.MasterArticleRepository;
import th.com.bigc.api.master_article.oracle.repositories.RecipeRepository;

@Service
public class ApiGoldMasterDataService {
    @PersistenceContext(name = "oracle")
    private EntityManager oracle;

    @Autowired
    private MasterArticleRepository masterArticleRepository;

    @Autowired
    private RecipeRepository recipeRepository;

    public ResponseEntity<Object> getArticleMaster(ArticleMaster articleMaster) {
        List<MasterArticleModel> data = null;
        try {
            if (articleMaster.getDivision_code().equals("ALL")) {
                data = masterArticleRepository.getArticleMaster();
            } else {
                data = masterArticleRepository.getArticleMasterByCode(articleMaster.getDivision_code());
            }
            return new ResponseEntity<Object>(data, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Object>(e.getMessage(), HttpStatus.BAD_GATEWAY);
        }
    }

    public ResponseEntity<Object> getRecipe(ArticleMaster articleMaster) {
        List<RecipeModel> data = null;
        try {
            if (articleMaster.getDivision_code().equals("ALL")) {
                data = recipeRepository.getRecipe();
            } else {
                data = recipeRepository.getRecipeByCode(articleMaster.getDivision_code());
            }
            return new ResponseEntity<Object>(data, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Object>(e.getMessage(), HttpStatus.BAD_GATEWAY);
        }
    }

}
