/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Ozone.app.conf.factory;

import com.Ozone.domain.*;;

import java.util.*;

/**
 *
 * @author boniface
 */
public class CustomerFactory {
    
    public static Customer createCustomer(Long value, Name name, Customeraddress address, Contact contact, Demographic demo,List<Orderdetails> orderdetails){
        
        Customer customer = new Customer
        //.Builder.id(value)
                //.id(value.get(id))
              .Builder(name)
                .address(address)
                .contact(contact)
                .demo(demo)
                .orderdetails(orderdetails)
                .build();
        return customer;
        /*customer.name(name);
        customer.address(address);
         customer.contact(contact);
        customer.demo(demo);*/
       
        //customer.setColour(values.get("color"));
        //department.setName("name");
        //department.setTheme("theme");
        
        //return customer;
    }
    
}
