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
import javax.persistence.OneToOne;

/**
 *
 * @author Lucrecia
 */
@Entity
public class Invoice implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Invoice (Builder builder){
        id = builder.id;
    }
    
    public Invoice() {
        
        orders = new HashSet();
    }
    public static class Builder{
        private Long id;
        
        public Builder setId(Long id){
            this.id= id;
            return this;
        }
        public Invoice build(){
            return new Invoice(this);
        }
    }
 public Long getId() {
        return id;
    }
       
@OneToOne (mappedBy "invoice")
private Collection<Orderdetails> orders;
public Collection<Orderdetails> getOrderdetails(){
    return orders;
}
public void setOrderdetails(Collection<Orderdetails> orders){
    this.orders = orders;
}
   

      @Embedded
    private Invoicedetails invDetails;
    public Invoicedetails getInvDetails(){
        return invDetails;
    }
    public void setInvDetails(Invoicedetails invDetails){
        this.invDetails = invDetails;
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
        if (!(object instanceof Invoice)) {
            return false;
        }
        Invoice other = (Invoice) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.Ozone.domain.Invoice[ id=" + id + " ]";
    }
    
}
