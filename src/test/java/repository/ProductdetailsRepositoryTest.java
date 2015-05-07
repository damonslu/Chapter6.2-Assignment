/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package repository;

import com.Ozone.domain.Productdetails;
//import static com.startup.musicstore.domain.PersonRepositoryTest.ctx;
import com.Ozone.repository.*;
import com.Ozone.app.ConnectionConfig; //ConnectionConfigTest;
//import static com.startup.musicstore.test.repository.CreditCardRepositoryTest.ctx;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author 201131153
 */
public class ProductdetailsRepositoryTest {

    public static ApplicationContext ctx;
     private Long id;
     private ProductdetailsRepository repo;
    public ProductdetailsRepositoryTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test(enabled = true)
     public void createProduct(){
        
         
         repo = ctx.getBean(ProductdetailsRepository.class);
         Productdetails p = repo.findOne(id);
                 
                 
         repo.save(p);
         id = p.getId();
         Assert.assertNotNull(p);
         
     }
     @Test(dependsOnMethods = "createProduct", enabled = true)
     public void readPerson(){
         repo = ctx.getBean(ProductdetailsRepository.class);
         Productdetails p = repo.findOne(id);
         Assert.assertEquals(p.getPrice(), "R500");
         
     }
     @Test(dependsOnMethods = "readProduct", enabled = true)
    private void updateProduct() {
        repo = ctx.getBean(ProductdetailsRepository.class);
        //GET THE OBJECT 
        Productdetails prod = repo.findOne(id);
        
        
        Assert.assertEquals(prod.getDescription(), "Victorian Couch");

    }
    // public void hello() {}
    @Test(dependsOnMethods = "updateProduct",enabled = true)
     private void deleteProduct(){
         repo = ctx.getBean(ProductdetailsRepository.class);
         Productdetails p = repo.findOne(id);
         repo.delete(p);
         
         Productdetails deletedProduct = repo.findOne(id);
         
         Assert.assertNull(deletedProduct);
         
         
     }
    @BeforeClass
    public static void setUpClass() throws Exception {
        
        ctx = new AnnotationConfigApplicationContext(ConnectionConfig.class);
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
