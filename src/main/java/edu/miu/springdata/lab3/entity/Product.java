package edu.miu.springdata.lab3.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private float price;

    @ManyToOne
    private Category category;

    //@OneToMany
    // UNCOMMENT FOR UNI-DIRECTIONAL JOIN COLUMN
    //@JoinColumn(name = "product_id")

    // UNCOMMENT FOR BI-DIRECTIONAL JOIN COLUMN
    @OneToMany(mappedBy = "product", fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<Review> rating;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_user")
    @JsonBackReference
    private User user;


}
