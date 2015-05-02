/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Ozone.repository;

import com.Ozone.domain.Demographic;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;

/**
 *
 * @author Lucrecia
 */
//@Repository
public interface DemographicRepository extends JpaRepository<Demographic, Long>{
    
}
