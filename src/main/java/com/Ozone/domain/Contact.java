/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ozone.domain;

import java.io.Serializable;
//import javax.persistence.Basic;
//import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.Table;
//import javax.validation.constraints.NotNull;
//mport javax.validation.constraints.Size;
//import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Lucrecia
 */
//@Table(name="CONTACT")
//@XmlRootElement
@Embeddable
public class Contact implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String phonenumber;
    
    private String email;

    private Contact(Builder builder) {
       phonenumber = builder.phonenumber;
        email = builder.email;
    }
    public Contact(){
    }

    public static class Builder{
    private String phonenumber;
    private String email;
    
    public  Builder setPhoneNumber(String phonenumber) {
        this.phonenumber = phonenumber;
        return this;
    }

    public Builder setEmail(String email) {
        //this.phonenumber = phonenumber;
        this.email = email;
        return this;
    }
     public Contact build(){
        return new Contact(this);
    }
    }
    public String getPhonenumber() {
        return phonenumber;
    }
    
    public String getEmail() {
        return email;
    }

        @Override
    public int hashCode() {
        int hash = 0;
        hash += (phonenumber != null ? phonenumber.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Contact)) {
            return false;
        }
        Contact other = (Contact) object;
        if ((this.phonenumber == null && other.phonenumber != null) || (this.phonenumber != null && !this.phonenumber.equals(other.phonenumber))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.Ozone.Contact[ phonenumber=" + phonenumber + " ]";
    }
    
    }
