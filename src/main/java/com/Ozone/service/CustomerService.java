package com.Ozone.service;

import com.Ozone.domain.Customer;
/**
 *
 * @author Administrator
 */
public interface CustomerService {
    public Customer findAll(String name, Long Id);

    //public int getNumber(Department it);
    
}