package com.example.lab3.Domain;

import com.example.lab3.Domain.Bi_Directinal.JoinColumn.Review1;
import com.example.lab3.Domain.Uni_Directinal.JoinTable.Review;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private Long price;
    private String rating;
    @ManyToOne(cascade = CascadeType.ALL)
    private Catagory catagory;
    @OneToMany(mappedBy = "product")
    private List<Review1> reviews1;
}
