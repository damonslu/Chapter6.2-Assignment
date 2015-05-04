/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Ozone.app.conf.factory;

import com.Ozone.domain.*;;

import java.util.Map;

/**
 *
 * @author boniface
 */
public class CustomerFactory {
    
    public static Customer getDepartment(Name name, Customeraddress address, Contact contact, Demographic demo, Map<String,String> values){
        
        Customer customer = new Customer();
        customer.setName(name);
        customer.setContact(contact);
         customer.setContact(contact);
        customer.setAddress(address);
        
        department.setColour(values.get("color"));
        department.setName("name");
        department.setTheme("theme");
        
        return department;
    }
    
}
