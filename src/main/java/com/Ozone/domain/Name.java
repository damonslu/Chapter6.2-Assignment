/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Ozone.domain;

import java.io.Serializable;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.*;


/**
 *
 * @author Lucrecia
 */
@Embeddable
public class Name implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstname;
    private String lastname;
    
    private Name(Builder builder){
        id = builder.id;
        firstname = builder.firstname;
        lastname = builder.lastname;
    }
    public Name(){
    
}
    public static class Builder{
    private Long id;
     private String firstname;
    private String lastname;
    
    public Builder setId(Long id){
        this.id = id;
        return this;
    }
    public Builder setFirstname(String firstname){
        this.firstname = firstname;
        return this;
    }
    public Builder setLastname(String lastname){
        this.lastname = lastname;
        return this;
    
    }
    public Name build(){
        return new Name(this);
    }
    }
    public Long getId(){
        return id;
    }
    public String getFirstname(){
        return firstname;
    }
    public String getLastname(){
        return lastname;
    }
   @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Name)) {
            return false;
        }
        Name other = (Name) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.Ozone.domain.Name[ id=" + id + " ]";
    }     
    
}