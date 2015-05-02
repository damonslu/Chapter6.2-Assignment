/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ozone.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persitence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author Lucrecia
 */
@Entity
public class Orderitem implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String itemname;
    private Integer itemquantity;
    
    private Orderitem(Builder builder){
    
        id = builder.id;
        itemname = builder.itemname;
        itemquantity = builder.itemquantity;
    } 
        public Orderitem(){
            
        }
    public static class Builder{
    private Long id;
    private String itemname;
    private Integer itemquantity;
    
    public Builder setId(Long id){
        this.id = id;
        return this;
    }
    public Builder setName(String itemname){
        this.itemname = itemname;
        return this;
    }
    public Builder setQauntity(Integer itemquantity){
        this.itemquantity = itemquantity;
        return this;
    }
      public Orderitem build(){
          return new Orderitem(this);
      }
    }   
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

     public Long getId(){
         return id;
     } 

    public String getItemname() {
        return itemname;
    }
    public int getItemquantity() {
        return itemquantity;
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
        if (!(object instanceof Orderitem)) {
            return false;
        }
        Orderitem other = (Orderitem) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ozone.domain.Orderitem[ id=" + id + " ]";
    }
    
}
