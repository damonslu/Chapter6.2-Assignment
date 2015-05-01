/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orderApp.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Lucrecia
 */
@Table(name="ORDERDETAILS")
@XmlRootElement
@Entity
public class Orderdetails implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ORDERID")
    private Integer orderid;
    private Collection<Orderitem> orderitems;
    //private Collection<Invoice> invoice; 
    @ManyToOne
    private Customer customer;
        public Customer getCustomer(){
        
        return customer;
    }
        public Orderdetails() {
        
        orderitems = new HashSet();
        //invoice = new HashSet();
    }
        @OneToOne(cascade=CascadeType.PERSIST)
    private Invoice inv;
        public Invoice getInvoice(){
        
        return inv;
    }
        public void setInvoice(Invoice inv){
            this.inv = inv;
        }
     /*public Orderdetails() {
        
        invoice = new HashSet();   
     }*/
    

    public Orderdetails(Integer orderid) {
        this.orderid = orderid;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
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
        hash += (orderid != null ? orderid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Orderdetails)) {
            return false;
        }
        Orderdetails other = (Orderdetails) object;
        if ((this.orderid == null && other.orderid != null) || (this.orderid != null && !this.orderid.equals(other.orderid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.orderApp.entity.Orderdetails[ orderid=" + orderid + " ]";
    }
    
}
