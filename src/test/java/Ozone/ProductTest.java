/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ozone;

import com.Ozone.app.conf.factory.ProductFactory;
import com.Ozone.domain.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author admin
 */

public class ProductTest {
    @BeforeClass
    public void setUp() throws Exception {


    }

    @Test
    public void testCreateProduct() throws Exception {
        List<Productdetails> productdetails = new ArrayList<Productdetails>();
        Map<String,String> values = new HashMap<String,String>();

        values.put("price","R500");
        values.put("quantity", "5");

        Product product =ProductFactory
                .createProduct(25, values, productdetails);

        Assert.assertEquals("R500",product.getCode());
    }

    @Test
    public void testUpadteCourse() throws Exception {
        List<Subject> lecturers = new ArrayList<Subject>();
        Map<String,String> values = new HashMap<String,String>();

        values.put("code","NDP2015");
        values.put("name", "National Diploma");

        Course course =CourseFactory
                .createCourse(25, values, lecturers);

        Course newcourse = new Course
                .Builder(course.getCode())
                .copy(course)
                .offering(20).build();

        Assert.assertEquals("NDP2015",newcourse.getCode());
        Assert.assertEquals("National Diploma",newcourse.getName());
        Assert.assertEquals(20,newcourse.getOffering());
        Assert.assertEquals(25,course.getOffering());


    }
}

    @BeforeClass
    public static void setUpClass() throws Exception {
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
