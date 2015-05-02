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
//@Table(name="CUSTOMERADDRESS")
//@XmlRootElement
@Embeddable
public class Customeraddress implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String streetaddress;
    private String city;
    private String region;

    private Customeraddress(Builder builder){
        id = builder.id;
        streetaddress = builder.streetaddress;
        city = builder.city;
        region = builder.region;
    }
    public Customeraddress(){
        
    }
    public static class Builder{
        
    private Long id;
    private String streetaddress;
    private String city;
    private String region;
    
    public Builder id(Long value){
        this.id = value;
        return this;
    }
       public Builder setStreetaddress(String value){
        this.streetaddress = value;
        return this; 
    }
       public Builder setCity(String value){
        this.city = value;
        return this;
       }
       public Builder setRegion(String value){
        this.region = value;
        return this;
       }
       public Customeraddress build(){
           return new Customeraddress(this);
       }
    }
    public String getStreetaddress() {
        return streetaddress;
    }
    public Long getId(){
        return id;
    }
    public String getCity() {
        return city;
    }
    public String getRegion() {
        return region;
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
        if (!(object instanceof Customeraddress)) {
            return false;
        }
        Customeraddress other = (Customeraddress) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ozone.domain.Customeraddress[ id=" + id + " ]";
    }
    
}
