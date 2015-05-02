/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Ozone.service;

import com.Ozone.domain.Product;
/**
 *
 * @author Lucrecia
 */
public interface ProductCrudService extends Service<Product, Long> {
    public Product getProductByName(String name);
    public int getNumberOfProducts();
    
    
}
