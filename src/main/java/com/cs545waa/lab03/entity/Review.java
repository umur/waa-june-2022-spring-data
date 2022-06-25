package com.cs545waa.lab03.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String comment;

    @JsonBackReference
    @ManyToOne
    private AppUser appUser;

    @JsonBackReference
    @ManyToOne
    private Product product;
}
