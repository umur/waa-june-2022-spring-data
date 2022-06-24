package com.data.springData.entity;

import javax.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private double price;
    private float rating;
    @ManyToOne
    private Category category;
}
