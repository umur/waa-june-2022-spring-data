package edu.miu.springdata.lab3.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="products")
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private float price;
    private int rating;

    //    @JsonIgnore
//    @JsonBackReference
    @JsonIgnoreProperties("products")
    @ManyToOne()
    private Category category;

    @JsonIgnoreProperties("category")
    @OneToMany(mappedBy = "product")
    private List<Review> reviews;
}
