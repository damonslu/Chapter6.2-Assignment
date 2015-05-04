package com.Ozone.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * 
 */
@Entity
public class Customer  implements Serializable{
    @Id
    private Long id;
    //private String name;
    @Embedded
    private Name name;
    @Embedded
    private Contact contact;
    @Embedded
    private Customeraddress address;
    @Embedded
    private Demographic demo;
    @OneToMany
    @JoinColumn(name = "cust_id")
    private List<Orderdetails> orderdetails;

    public Customer() {
    }

        public Long getId() {
        return id;
    }

        public Name getName(){
        return name;
    }

    public Customeraddress getAddress() {
        return address;
    }
    public Contact getContact(){
        return contact;
    }
    public Demographic getDemographic(){
        return demo;
    }

    public List<Orderdetails> getOrderdetails() {
        return orderdetails;
    }

    public Customer(Builder builder) {
        this.address=builder.address;
        this.id=builder.id;
        this.name = builder.name;
        this.contact = builder.contact;
        this.demo = builder.demo;
        this.orderdetails=builder.orderdetails;
        //this.name=builder.name;
    }

    public static class Builder{
        private Long id;
        //private String name;
        private Name name;
        private Customeraddress address;
        private Contact contact;
        private Demographic demo;
        private List<Orderdetails> orderdetails;

        public Builder id(Long value){
            this.id=value;
            return this;
        }
        public Builder name(Name value){
            this.name=value;
            return this;
        }
        public Builder address(Customeraddress value){
            this.address=value;
            return this;
        }
        public Builder contact(Contact value){
            this.contact=value;
            return this;
        }
        public Builder demo(Demographic value){
            this.demo=value;
            return this;
        }
        public Builder orderdetails(List<Orderdetails> value){
            this.orderdetails = value;
            return this;
        }
        
        public Builder copy(Customer value){
            this.orderdetails=value.orderdetails;
            this.address=value.address;
            this.contact = value.contact;
            this.demo = value.demo;
            this.id=value.id;
            this.name=value.name;
            return this;
        }

        public Customer build(){
            return new Customer(this);
        }

    }
}
