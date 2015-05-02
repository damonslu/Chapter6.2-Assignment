/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Ozone.domain;

//import com.Ozone.domain.Customer;
import java.io.Serializable;
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
       id = builder.id;
        phonenumber = builder.phonenumber;
        email = builder.email;
    }
    public Contact(){
    }

    public static class Builder{
    private Long id;
        private String phonenumber;
    private String email;
    
    public Builder setId(Long id){
        this.id = id;
        return this;
               
    }
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
    public Long getId(){
        
        return id;
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
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Contact)) {
            return false;
        }
        Contact other = (Contact) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.Ozone.Contact[ id=" + id + " ]";
    }
    
    }
