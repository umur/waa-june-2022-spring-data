package com.data.springData.entity;

import javax.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue
    private int id;
    private int name;

    @ManyToOne
    private Category category;
}
