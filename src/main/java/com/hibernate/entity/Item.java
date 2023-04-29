package com.hibernate.entity;

import jakarta.persistence.*;
import org.hibernate.id.factory.internal.AutoGenerationTypeStrategy;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
public class Item
{

        @Id
        @GeneratedValue()
        int id;
        String name;

    public Item(String name) {
        this.name = name;
    }

    @OneToOne( cascade = CascadeType.ALL, mappedBy = "item")
    private Customer customer;

}
