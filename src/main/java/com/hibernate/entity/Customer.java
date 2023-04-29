package com.hibernate.entity;

import com.hibernate.entity.*;
import jakarta.persistence.*;

@Entity
@Table
public class Customer
{
    @Id
    @GeneratedValue
    private int id;
    private String name;


    public Customer( String name) {
        this.name = name;
    }

    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "fk_item")
    @JoinTable(name= "customer_item",
            joinColumns = {@JoinColumn(name ="customer_Id")},
            inverseJoinColumns = {@JoinColumn(name ="item_Id")} )
    private Item item;

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

}
