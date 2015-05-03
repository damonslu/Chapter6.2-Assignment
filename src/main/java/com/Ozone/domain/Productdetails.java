/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Ozone.domain;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Lucrecia
 */

@Entity
public class Productdetails implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private double price;
    private Integer quantity;
       //private String productID;
       
       private Productdetails(Builder builder){
           id = builder.id;
           price = builder.price;
           quantity = builder.quantity;
        }
       public Productdetails(){
           
       }
       public static class Builder{
           private Long id;;
           private double price;
           private Integer quantity;
           
           public Builder setId(Long id){
               this.id = id;
               return this;
           }
           public Builder setPrice(double price){
               this.price = price;
               return this;
           }
           public Builder setQuantity(Integer quantity){
               this.quantity = quantity;
               return this;
           }
           public Builder copy(Productdetails value){
               this.id = value.id;
               this.price = value.price;
               this.quantity  = value.quantity;
               return this;
           }
           public Productdetails build(){
               return new Productdetails(this);
           }
       }
       public Long getId(){
           return id;
       }
    private Collection<Orderitem> products;
    //private String productname;
    //@Basic(optional = false)
    //@NotNull
    //@Column(name = "PRODUCTPRICE")
    //private double productprice;

    

    /*public Productdetails(String productname, double productprice) {
        this.productname = productname;
        this.productprice = productprice;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public double getProductprice() {
        return productprice;
    }

    public void setProductprice(double productprice) {
        this.productprice = productprice;
    }*/
    @OneToMany(mappedBy = "productDetails")
        public Collection<Orderitem> getProducts(){
        return products;
    }
    public void setProducts(Collection<Orderitem> products){
        
        this.products = products;
    }
@Embedded
    private Product pd;
    public Product getDetails(){
        return pd;
    }
    public void setDetails(Product pd){
        this.pd = pd;
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
        if (!(object instanceof Productdetails)) {
            return false;
        }
        Productdetails other = (Productdetails) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    
    
}
