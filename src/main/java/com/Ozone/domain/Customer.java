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
import javax.persistence.Embedded;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Lucrecia
 */
@Table(name="CUSTOMER")
@XmlRootElement
@Entity
public class Customer implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CUSTOMERID")
    private Integer customerid;
    private Collection<Orderdetails> orderdetails;

    public Customer() {
        orderdetails = new HashSet();
    }

    public Customer(Integer customerid) {
        this.customerid = customerid;
    }

    public Integer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
    }
    @OneToMany(mappedBy = "customer")
    public Collection<Orderdetails>getOrderdetails(){
        return orderdetails;
    }
    public void setOrderdetails(Collection<Orderdetails> orderdetails){
        this.orderdetails = orderdetails;
    }
    @Embedded
    private Customeraddress address;
    public Customeraddress getAddress(){
        return address;
    }
    public void setAddress(Customeraddress address){
        this.address = address;
    }
    @Embedded
    private Contact contact;
    public Contact geContact(){
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
    public Name geName(){
        return name;
    }
    public void setName(Name name){
        this.name = name;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (customerid != null ? customerid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Customer)) {
            return false;
        }
        Customer other = (Customer) object;
        if ((this.customerid == null && other.customerid != null) || (this.customerid != null && !this.customerid.equals(other.customerid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.orderApp.entity.Customer[ customerid=" + customerid + " ]";
    }
    
}
