/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Ozone.app.conf.factory;

import com.Ozone.domain.Customer;
//import com.Ozone.domain.Invoice;
import com.Ozone.domain.Customeraddress;
import com.Ozone.domain.Name;
import com.Ozone.domain.Contact;
import com.Ozone.domain.Demographic;
import java.util.*;

//import com.Ozone.domain.Name;



/**
 *
 * @author Lucrecia
 */
public class CustomerFactory {
    public static Customer createCustomer(Map<String, String> values){
      
        Customer customer = new Customer();
        customer.setName(values.get("firstname", "lastname"));
        customer.setDemo(values.get);
    }
    
}
