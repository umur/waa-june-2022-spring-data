package com.data.springData.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="reviews")
@Data

public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int id;
    private String comment;

    @JsonIgnoreProperties("reviews")
    @ManyToOne()
    private Product product;

}
