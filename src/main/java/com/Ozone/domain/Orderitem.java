/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orderApp.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Lucrecia
 */
@Table(name="ORDERITEM")
@XmlRootElement
@javax.persistence.Entity
public class Orderitem implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "ITEMNAME")
    private String itemname;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ITEMQUANTITY")
    private int itemquantity;
    @ManyToOne
    private Orderdetails orderdetails;
    public Orderdetails getOrderdetails(){
        return orderdetails;
    }
    @ManyToOne
    private Product product;
    public Product getProduct(){
        return product;
    }

    public Orderitem() {
    }

    public Orderitem(String itemname) {
        this.itemname = itemname;
    }

    public Orderitem(String itemname, int itemquantity) {
        this.itemname = itemname;
        this.itemquantity = itemquantity;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public int getItemquantity() {
        return itemquantity;
    }

    public void setItemquantity(int itemquantity) {
        this.itemquantity = itemquantity;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (itemname != null ? itemname.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Orderitem)) {
            return false;
        }
        Orderitem other = (Orderitem) object;
        if ((this.itemname == null && other.itemname != null) || (this.itemname != null && !this.itemname.equals(other.itemname))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.orderApp.entity.Orderitem[ itemname=" + itemname + " ]";
    }
    
}
