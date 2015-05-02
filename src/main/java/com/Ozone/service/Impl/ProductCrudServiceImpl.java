/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Ozone.service.Impl;

import com.Ozone.domain.Product;
import com.Ozone.repository.ProductRepository;
import com.Ozone.service.ProductCrudService;
import java.util.*;
import org.springframwor.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Lucrecia
 */
@Service
public class ProductCrudServiceImpl implementation ProductCrudService{

    @Autowired
    private ProductRepository productRepository;
    @Override
    public Product find(Long id){
        
        return productRepository.findOne(id);
    }
    
}
