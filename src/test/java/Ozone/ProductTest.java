package Ozone;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//package com.Ozone.test;

//import com.Ozone.domain.Product;
//import com.Ozone.domain.Productdetails;
import com.Ozone.service.ProductCrudService;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

/**
 *
 * @author Lucrecia
 */
public class ProductTest {
    
    private ProductCrudService productCrudService;
    private Long id;
    private static ApplicationContext ctx;
    public ProductTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
    // public void hello() {}
     public void createProduct(){
         productCrudService = (ProductCrudService) ctx.getBean("studentCrudService");
         Productdetails productdetails = 
     }
    @BeforeClass
    public static void setUpClass() throws Exception {
        ctx = new ClassPathXmlApplicationContext("classpath: com/Ozone/app/conf/applicationContext-*.xml");
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
