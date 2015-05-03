/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Ozone.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Lucrecia
 */
@Embeddable
public class Demographic implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String gender;
    private String race;
    private Date dob;

    private Demographic(Builder builder){
        id = builder.id;
        gender = builder.gender;
        race = builder.race;
        dob = builder.dob;
    }
    public Demographic(){
        
    }
    public static class Builder{
        
    private Long id;
    private String gender;
    private String race;
    private Date dob;
    
    public Builder id(Long value){
        this.id = value;
        return this;
    }
       public Builder setGender(String value){
        this.gender = value;
        return this; 
    }
       public Builder setRace(String value){
        this.race = value;
        return this;
       }
       public Builder setDob(Date value){
        this.dob = value;
        return this;
       }
       public Builder copy(Demographic value){
           this.id = value.id;
           this.gender = value.gender;
           this.race = value.race;
           this.dob= value.dob;
           return this;
       }
       public Demographic build(){
           return new Demographic(this);
       }
    
    public String getGender() {
        return gender;
    }
    }
    public Long getId(){
        return id;
    }

    public String getRace() {
        return race;
    }

    public Date getDob() {
        return dob;
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
        if (!(object instanceof Demographic)) {
            return false;
        }
        Demographic other = (Demographic) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ozone.domain.Demographic[ gender=" + id + " ]";
    }
    
}
