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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

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
    private Orderdetails(Builder builder){
        id = builder.id;
    }
    public Orderdetails() {
        
        orderitems = new HashSet();
        //invoice = new HashSet();
    }
    public static class Builder{
        private Long id;
        
        public Builder setId(Long id){
            this.id = id;
            return this;
        }
        public Orderdetails build(){
            return new Orderdetails(this);
        }
    }
    public Long getId(){
        return id;
    }
    //private Integer orderid;
    private Collection<Orderitem> orderitems;
    //private Collection<Invoice> invoice; 
    @ManyToOne
    private Customer customer;
        public Customer getCustomer(){
        
        return customer;
    }
        
        @OneToOne(cascade=CascadeType.PERSIST)
    private Invoice inv;
        public Invoice getInvoice(){
        
        return inv;
    }
        public void setInvoice(Invoice inv){
            this.inv = inv;
        }
    
        @OneToMany(mappedBy = "orderdetails")
    public Collection<Orderitem> getOrderitem(){
        
        return orderitems;
    }
    public void setOrderItem(Collection<Orderitem> orderitems ){
        
        this.orderitems = orderitems;
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
