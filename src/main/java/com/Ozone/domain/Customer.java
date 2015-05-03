/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Ozone.domain;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;
import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

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
    @OneToOne(cascade = CascadeType.ALL)
    private Collection<Name> name;
    @OneToMany(cascade = CascadeType.ALL)
    private Collection<Orderdetails> orderdetails;
    private Customer(){
        
    }
    public Customer(Builder builder){
        id = builder.id;
        orderdetails = builder.orderdetails;
        name = builder.name;
    }
    

   /* public Customer() {
        orderdetails = new HashSet();
    }*/
    public static class Builder{
        
        private Long id;
        private Collection<Orderdetails> orderdetails;
        private Collection<Name> name;
        public Builder setId(Long id){
            this.id = id;
            return this;
        }
        public Builder setName(Collection<Name> name ){
            this.name = name;
            return this;
        }
        public Builder setOrderdetails(Collection<Orderdetails> orderdetails){
            this.orderdetails = orderdetails;
            return this;
        }
        public Builder name(Collection<Name> value){
        this.name = value;
        return this;
}
        public Builder getName(Customer value){
            
            this.name= value.getName();
                              
            this.id = value.getId();
            this.orderdetails = value.getOrderdetails();
            return this;
                    
        }     
        public Customer build(){
            return new Customer(this);
        }
    }

        public Long getId() {
        return id;
    }

        
    public Collection<Orderdetails> getOrderdetails(){
        return orderdetails;
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
    public Demographic getDemo(){
        return dmo;
    }
    public void setDemo(Demographic dmo){
        this.dmo = dmo;
    }
    @Embedded
    private  Collection<Name> name;
    public Collection<Name> getName(){
        return name;
    }
    /*public name.getLastname(){
        return lastname;
    }*/
    public Collection<Name> setName(Customer value){
        this.name = (Collection<Name>) value;
        return (Collection<Name>) this;
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
