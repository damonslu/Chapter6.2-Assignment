/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Ozone.service;

import com.Ozone.domain.Productdetails;
/**
 *
 * @author Lucrecia
 */
public interface ProductCrudService extends Service<Productdetails, Long> {
    public Productdetails getProductByName(String name);
    public int getNumberOfProducts();
    
    
}
