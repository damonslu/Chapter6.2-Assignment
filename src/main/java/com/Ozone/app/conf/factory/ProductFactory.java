/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Ozone.app.conf.factory;

import com.Ozone.domain.Product;
import com.Ozone.domain.Productdetails;
import java.util.*;


/**
 *
 * @author Lucrecia
 */
public class ProductFactory {
    public static Product createProduct(Productdetails productdetails, Map<String, String> values){
        Product product = new Product();
        return product;
                
    }
    
}
