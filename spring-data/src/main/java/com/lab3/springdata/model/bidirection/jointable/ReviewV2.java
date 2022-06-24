package com.lab3.springdata.model.bidirection.jointable;

import javax.persistence.*;

@Entity
public class ReviewV2 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String comment;

    @ManyToOne
    private UserV2 userV2;
}
