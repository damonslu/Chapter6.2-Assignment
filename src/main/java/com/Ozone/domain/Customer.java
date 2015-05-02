/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Ozone.domain;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
//import javax.persistence.Table;
//import javax.validation.constraints.NotNull;
//import javax.xml.bind.annotation.XmlRootElement;*/

/**
 *
 * @author Lucrecia
 */

@Entity
public class Customer implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;  
    private Customer(Builder builder){
        id = builder.id;
    }
    private Collection<Orderdetails> orderdetails;

    public Customer() {
        orderdetails = new HashSet();
    }
    public static class Builder{
        
        private Long id;
        public Builder setId(Long id){
            this.id = id;
            return this;
        }
        public Customer build(){
            return new Customer(this);
        }
    }

        public Long getId() {
        return id;
    }

        @OneToMany(mappedBy = "customer")
    public Collection<Orderdetails> getOrderdetails(){
        return orderdetails;
    }
    public void setOrderdetails(Collection<Orderdetails> orderdetails){
        this.orderdetails = orderdetails;
    }
    @Embedded
    private Customeraddress address;
    public Customeraddress getAdress(){
        return address;
    }
    public void setAddress(Customeraddress address){
        this.address = address;
    }
    @Embedded
    private Contact contact;
    public Contact getContact(){
        return contact;
    }
    public void setContact(Contact contact){
        this.contact = contact;
    }
    @Embedded
    private Demographic dmo;
    public Demographic geDemo(){
        return dmo;
    }
    public void setDemo(Demographic dmo){
        this.dmo = dmo;
    }
    @Embedded
    private Name name;
    public Name getName(){
        return name;
    }
    public void setName(Name name){
        this.name = name;
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
        if (!(object instanceof Customer)) {
            return false;
        }
        Customer other = (Customer) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ozone.Customer[ id=" + id + " ]";
    }
    
}
