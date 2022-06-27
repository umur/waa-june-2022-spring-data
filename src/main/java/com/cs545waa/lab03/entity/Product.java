package com.cs545waa.lab03.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity //JPA requirement
@Data   //getter and setter
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private double price;
    private int rating;

    @JsonManagedReference
    @OneToOne(cascade = CascadeType.PERSIST)
    private Category category;

    @JsonManagedReference
    @ManyToOne
    private AppUser appUser;

    @JsonBackReference
    @OneToMany(mappedBy = "product")
    private List<Review> reviews;
}
