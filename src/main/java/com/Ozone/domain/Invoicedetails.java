/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Ozone.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Embeddable;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/**
 *
 * @author Lucrecia
 */

@Embeddable
public class Invoicedetails implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date orderdate;
    private double orderamount;
private Invoicedetails(Builder builder){
    id = builder.id;
    orderdate = builder.orderdate;
    orderamount = builder.orderamount;
}
    public Invoicedetails() {
    }
public static class Builder{
    private Long id;
    private Date orderdate;
    private double orderamount;
    
    public Builder setId(Long id){
        this.id  = id;
        return this;
    }
    public Builder setDate(Date orderdate){
        this.orderdate  = orderdate;
        return this;
    }
    public Builder setAmount(double orderamount){
        this.orderamount  = orderamount;
        return this;
    }
    public Builder copy(Invoicedetails value){
        this.id = value.id;
        this.orderdate = value.orderdate;
        this.orderamount = value.orderamount;
        return this;
    }
    public Invoicedetails build(){
        return new Invoicedetails(this);
    }
    
}
public Long getId(){
    return id;
}
 public java.util.Date getOrderdate() {
        return orderdate;
    }

 public double getOrderamount() {
        return orderamount;
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
        if (!(object instanceof Invoicedetails)) {
            return false;
        }
        Invoicedetails other = (Invoicedetails) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.Ozone.domain.Invoicedetails[ id=" + id + " ]";
    }
    
}
