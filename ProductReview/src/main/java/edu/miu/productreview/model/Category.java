package edu.miu.productreview.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

//    @OneToMany
    @OneToMany(mappedBy = "category",cascade = CascadeType.ALL) // Bi directional
//    @JoinColumn(name = "category_id")
    private List<Product> products;
}
