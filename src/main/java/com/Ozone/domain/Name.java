/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Ozone.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.*;


/**
 *
 * @author Lucrecia
 */
@Entity
public class Name implements Serializable{
    private static final long serialVersionUID = 1L;
    //@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String firstname;
    private String lastname;
    
    private Name(Builder builder){
        firstname = builder.firstname;
        lastname = builder.lastname;
    }
    public Name(){
    
}
    public static class Builder{
    private String firstname;
    private String lastname;
    
    public Builder setFirstname(String firstname){
        this.firstname = firstname;
        return firstname;
    }
    public Builder setLastname(String lastname){
        this.lastname = lastname;
        return lastname;
    
    }
    public String getFirstname(){
        return firstname;
    }
    public String getLastname(){
        return lastname;
    }
        public Name build(){
            return new Name(this);
        }
    }
