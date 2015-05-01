/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orderApp.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Embedded;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Lucrecia
 */
@Table(name="INVOICE")
@XmlRootElement
@Entity
public class Invoice implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "INVOICEID")
    private Integer invoiceid;
    private Collection<Orderdetails> orders;

    public Invoice() {
        
        orders = new HashSet();
    }

    public Invoice(Integer invoiceid) {
        this.invoiceid = invoiceid;
    }
//@OneToOne (mappedBy "invoice")
public Collection<Orderdetails> getOrderdetails(){
    return orders;
}
public void setOrderdetails(Collection<Orderdetails> orders){
    this.orders = orders;
}
    public Integer getInvoiceid() {
        return invoiceid;
    }

    public void setInvoiceid(Integer invoiceid) {
        this.invoiceid = invoiceid;
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
        hash += (invoiceid != null ? invoiceid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Invoice)) {
            return false;
        }
        Invoice other = (Invoice) object;
        if ((this.invoiceid == null && other.invoiceid != null) || (this.invoiceid != null && !this.invoiceid.equals(other.invoiceid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.orderApp.entity.Invoice[ invoiceid=" + invoiceid + " ]";
    }
    
}
