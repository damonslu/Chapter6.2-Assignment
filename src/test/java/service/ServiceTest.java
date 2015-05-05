/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package service;

import com.Ozone.domain.Contact;

import com.Ozone.domain.Customer;
import com.Ozone.repository.CustomerRepository;
//import com.Ozone.test.ConnectionConfigTest;

//import com.startup.musicstore.test.services.ServiceTest;
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
public class ServiceTest {
    public static ApplicationContext ctx;
    private Long id;
    private ServiceTest contactService;
    public ServiceTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     
     public void fwdAddress(){
          contactService = (ServiceTest) ctx.getBean(CustomerRepository.class);
         Customer c = contactService.findOne(id);
         Assert.assertEquals(c.getContact(), "B");
         
     }
    // public void hello() {}

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

    private Customer findOne(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
