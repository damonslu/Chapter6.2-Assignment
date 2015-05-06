package Ozone;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import com.Ozone.app.conf.factory.CustomerFactory;
import com.Ozone.domain.Customer;
import java.util.*;
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
public class CustomerTest {
    
    public CustomerTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
    }
    @Test
    public void testCreateCustomer() throws Exception{
        Map<String,String> values = new HashMap<String, String>();
        values.put("firstname", "Lucrecia");
        values.put("lastname", "Damons");
        //Customer c  = CustomerFactory.();
        Customer c = CustomerFactory.createCustomer(Long.MIN_VALUE, null, null, null, null, null);
        //values.put.(contact, 
        //Assert.assertEquals("Lucrecia", c.)
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
