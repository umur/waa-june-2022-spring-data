package com.lab3.springdata.model.bidirection.jointable;

import javax.persistence.*;

@Entity
public class ProductV2 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private double price;
    private int rating;

    @ManyToOne
    private CategoryV2 category;
}
