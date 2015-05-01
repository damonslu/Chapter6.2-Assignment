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
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
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
@Table(name="PRODUCT")
@XmlRootElement
@Embeddable
public class Product implements Serializable {
    private static final long serialVersionUID = 1L;
    //@Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "PRODUCTDescription")
    private String productDesc;
        private Collection<Orderitem> products;
        public Product() {
        products = new HashSet();
    }

    public Product(String productDesc) {
        this.productDesc = productDesc;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }
    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productDesc != null ? productDesc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Product)) {
            return false;
        }
        Product other = (Product) object;
        if ((this.productDesc == null && other.productDesc != null) || (this.productDesc != null && !this.productDesc.equals(other.productDesc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.orderApp.entity.Product[ productid=" + productDesc + " ]";
    }

	
}
