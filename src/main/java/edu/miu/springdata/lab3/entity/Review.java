package edu.miu.springdata.lab3.entity;

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

//    @ManyToOne
//    private User user;

    @JsonIgnoreProperties("reviews")
    @ManyToOne()
    private Product product;
}
