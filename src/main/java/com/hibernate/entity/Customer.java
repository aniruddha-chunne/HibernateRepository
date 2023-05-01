package com.hibernate.entity;

import com.hibernate.entity.*;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

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

//    @OneToMany(cascade = CascadeType.ALL)
//    private List<Item> item  = new ArrayList<>();
//
//
//    public List<Item> getItem() {
//        return item;
//    }
//
//    public void setItem(List<Item> item) {
//        this.item = item;
//    }
}
