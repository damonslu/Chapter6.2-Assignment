/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Ozone.domain;

import java.io.Serializable;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Lucrecia
 */

@Embeddable
public class Product implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String productDesc;
    
    private Product (Builder builder){
        id = builder.id;
        productDesc = builder.productDesc;
    }
    public Product(){
        
    }
    public static class Builder{
        private Long id;
        private String productDesc;

        public Builder(Long value) {
            throw new UnsupportedOperationException("Not yet implemented");
        }
        
        public Builder setId(Long id){
            this.id = id;
            return this;
        }
        public Builder setDesc(String productDesc){
            this.productDesc = productDesc;
            return this;
        }
        public Builder copy(Product value){
            this.id = value.id;
            this.productDesc = value.productDesc;
            return this;
        }
        public Product build(){
            return new Product(this);
        }
    
    }
        /* private Collection<Orderitem> products;
}
        public Product() {
        products = new HashSet();
    }*/

public Long getId(){
    return id;
}
public String getProductDesc() {
        return productDesc;
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
        if (!(object instanceof Product)) {
            return false;
        }
        Product other = (Product) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.Ozone.Product[ id=" + id + " ]";
    }

	
}
