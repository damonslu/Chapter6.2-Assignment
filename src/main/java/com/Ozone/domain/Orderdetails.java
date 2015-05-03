/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Ozone.domain;

//import com.Ozone.domain.Invoice;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Embedded;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.JoinColumn;
import java.util.List;

/**
 *
 * @author Lucrecia
 */

@Entity
public class Orderdetails implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @Embedded
    private List<Orderitem> orderitems;
    @OneToMany
    @JoinColumn(name = "id")
    private List<Productdetails> productdetails;
    @ManyToOne
    private List<Customer> customers;
    @OneToOne(cascade=CascadeType.PERSIST)
    private Invoice invoice;
    
    private Orderdetails(Builder builder){
        this.id = builder.id;
        this.name = builder.name;
        this.customers = builder.customers;
        this.orderitems = builder.orderitems;
        this.productdetails = builder.productdetails;
    }
    private Orderdetails() {
        
        //orderitems = new HashSet();
        //invoice = new HashSet();
    }
    public static class Builder{
        private Long id;
        private String name;
        private List<Customer> customers;
        private List<Orderitem> orderitems;
        private List<Productdetails> productdetails;
        private Invoice invoice;
        
        public Builder id(Long value){
            this.id = value;
            return this;
        }
        public Builder(String name){
            this.name = name;
        }
        public Builder orderitems(List<Orderitem> value){
            this.orderitems = value;
            return this;
            
        }
        public Builder customers(List<Customer> value){
            this.customers = value;
            return this;
        }
        public Builder productdetails(List<Productdetails> value){
            this.productdetails = value;
            return this;
            
        }
        public Builder invoice(Invoice value){
            this.invoice = value;
            return this;
            
        }
        public Builder copy(Orderdetails value){
            this.id = value.id;
            this.customers = value.customers;
            this.name= value.name;
            this.orderitems = value.orderitems;
            this.productdetails = value.productdetails;
            this.invoice = value.invoice;
            return this;
        }
        public Orderdetails build(){
            return new Orderdetails(this);
        }
    }
    public Long getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public List<Orderitem >getOrderitems(){
        
        return orderitems;
    }
    public List<Customer >getCustomer(){
        
        return customers;
    }
    public List<Productdetails> getProductdetails(){
        
        return productdetails;
    }
    public Invoice getInvoice(){
        
        return invoice;
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
        if (!(object instanceof Orderdetails)) {
            return false;
        }
        Orderdetails other = (Orderdetails) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ozone.domain.Orderdetails[ oid=" + id + " ]";
    }
    
}
