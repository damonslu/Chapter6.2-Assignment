/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package repository;

import com.Ozone.domain.Product;
//import static com.startup.musicstore.domain.PersonRepositoryTest.ctx;
import com.Ozone.repository.*;
//import ConnectionConfigTest;
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
public class ProductRepositoryTest {

    public static ApplicationContext ctx;
     private Long id;
     private ProductRepository repo;
    public ProductRepositoryTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test(enabled = true)
     public void createProduct(){
         
         repo = ctx.getBean(ProductRepository.class);
         Product p = repo.findOne(id);
                 
                 
         repo.save(p);
         id = p.getId();
         Assert.assertNotNull(p);
         
     }
     @Test(dependsOnMethods = "createCustomer", enabled = true)
     public void readPerson(){
         repo = ctx.getBean(ProductRepository.class);
         Product p = repo.findOne(id);
         Assert.assertEquals(p.getProductDescription(), "Furniture");
         
     }
     @Test(dependsOnMethods = "readProduct", enabled = true)
    private void updateProduct() {
        repo = ctx.getBean(ProductRepository.class);
        //GET THE OBJECT 
        Product prod = repo.findOne(id);
        
        
        Assert.assertEquals(prod.getProductName(), "Victorian Couch");

    }
    // public void hello() {}
    @Test(dependsOnMethods = "updateProduct",enabled = true)
     private void deleteProduct(){
         repo = ctx.getBean(ProductRepository.class);
         Product p = repo.findOne(id);
         repo.delete(p);
         
         Product deletedProduct = repo.findOne(id);
         
         Assert.assertNull(deletedProduct);
         
         
     }
    @BeforeClass
    public static void setUpClass() throws Exception {
        
        ctx = new AnnotationConfigApplicationContext(ConnectionConfigTest.class);
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
