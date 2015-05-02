/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Ozone.service.Impl;

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
