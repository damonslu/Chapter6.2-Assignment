/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orderApp.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Embeddable;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Lucrecia
 */
@Table(name="INVOICEDETAILS")
@XmlRootElement
@Embeddable
public class Invoicedetails implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
	@Basic(optional=false)
	@NotNull
	@Column(name="ORDERDATE")
    private Date orderdate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ORDERAMOUNT")
    private double orderamount;

    public Invoicedetails() {
    }

    public Invoicedetails(Date orderdate) {
        this.orderdate = orderdate;
    }

    public Invoicedetails(Date orderdate, double orderamount) {
        this.orderdate = orderdate;
        this.orderamount = orderamount;
    }

    public java.util.Date getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(java.util.Date orderdate) {
        this.orderdate = orderdate;
    }

    public double getOrderamount() {
        return orderamount;
    }

    public void setOrderamount(double orderamount) {
        this.orderamount = orderamount;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderdate != null ? orderdate.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Invoicedetails)) {
            return false;
        }
        Invoicedetails other = (Invoicedetails) object;
        if ((this.orderdate == null && other.orderdate != null) || (this.orderdate != null && !this.orderdate.equals(other.orderdate))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.orderApp.entity.Invoicedetails[ orderdate=" + orderdate + " ]";
    }
    
}
