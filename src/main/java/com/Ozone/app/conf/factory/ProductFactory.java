/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Ozone.app.conf.factory;

import com.Ozone.domain.*;;

import java.util.*;
import javax.websocket.ClientEndpointConfig;
import java.util.*;

/**
 *
 * @author boniface
 */
public class ProductFactory {
    
    /**
     *
     * @param id
     * @param price
     * @param quantity
     * @return
     */
    public static Productdetails createProduct(double price,Integer quantity, String description){
        
        Productdetails productdetails = new Productdetails
        //.Builder.id(value)
                //.id(value.get(id))
             .Builder(price)
                .setQuantity(quantity)
                .setDescription(description)
                .build();
        return productdetails;
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
