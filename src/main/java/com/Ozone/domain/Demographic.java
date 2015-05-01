/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orderApp.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

//import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Lucrecia
 */
@Table(name="DEMOGRAPHIC")
@XmlRootElement
@Embeddable
public class Demographic implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "GENDER")
    private String gender;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "RACE")
    private String race;
    @Basic(optional=false)
	@NotNull
	@Column(name="DOB")
    private Date dob;

    public Demographic() {
    }

    public Demographic(String gender) {
        this.gender = gender;
    }

    public Demographic(String gender, String race, Date dob) {
        this.gender = gender;
        this.race = race;
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public java.util.Date getDob() {
        return dob;
    }

    public void setDob(java.util.Date dob) {
        this.dob = dob;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (gender != null ? gender.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Demographic)) {
            return false;
        }
        Demographic other = (Demographic) object;
        if ((this.gender == null && other.gender != null) || (this.gender != null && !this.gender.equals(other.gender))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.orderApp.entity.Demographic[ gender=" + gender + " ]";
    }
    
}
