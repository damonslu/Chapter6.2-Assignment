/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Ozone.repository;

import com.Ozone.domain.Name;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;

/**
 *
 * @author Lucrecia
 */
//@Repository
public interface NameRepository extends JpaRepository<Name, Long>{
    
}
