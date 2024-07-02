package th.com.bigc.api.master_article.oracle.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import th.com.bigc.api.master_article.oracle.repositories.MasterArticleRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Service
public class MasterArticleService {
    @PersistenceContext(name = "oracle")
    private EntityManager oracle;
    
    @Autowired
    private MasterArticleRepository masterArticleRepository;

    public ResponseEntity<Object> getData() {
        try {
            return new ResponseEntity<Object>("OK", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Object>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
    
}
