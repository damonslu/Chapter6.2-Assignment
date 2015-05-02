/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ozone.domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

//import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

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
    @GedneratedValue(strategy = GenerationType.AUTO)
    /*@Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "STREETADDRESS")*/
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
    
    public String getStreetaddress() {
        return streetaddress;
    }
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
