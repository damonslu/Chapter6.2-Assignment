/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import com.Ozone.app.ConnectionConfig;
import com.Ozone.domain.Customer;
import com.Ozone.repository.CustomerRepository;
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
 * @author Lucrecia
 */
public class CustomerRepositoryTest {
    public static ApplicationContext ctx;
    private Long id;
    private CustomerRepository repo;
    @Test
    public void newCustomer(){
        repo = ctx.getBean(CustomerRepository.class);
        Customer cust = repo.findOne(id);
        //cust.setName("Lucrecia");
        repo.save(cust);
        id = cust.getId();
        Assert.assertNotNull(cust);
    }
    public CustomerRepositoryTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

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
