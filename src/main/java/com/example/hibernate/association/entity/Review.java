package com.example.hibernate.association.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String comment;

    @ManyToOne(cascade = CascadeType.ALL)
    User user;


}
