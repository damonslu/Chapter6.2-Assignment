/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

//import com.Ozone.;
import com.Ozone.app.ConnectionConfig;
import com.Ozone.domain.Orderdetails;
import com.Ozone.repository.OrderdetailsRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

/**
 *
 * @author Lucrecia
 */
public class OrderdetailsRepositoryTest {
    public static ApplicationContext ctx;
    private Long id;
    private OrderdetailsRepository repo;
    
    public OrderdetailsRepositoryTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void createOrderdetails(){
        repo = ctx.getBean(OrderdetailsRepository.class);
        Orderdetails orderdetails = new Orderdetails.Builder("lucrecia@cput.ac.za")
               orderdetails.setId(3);
               rep.save(orderdetails);
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
