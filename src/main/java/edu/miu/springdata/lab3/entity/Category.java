package edu.miu.springdata.lab3.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="catagories")
@Data
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;
//    @JsonManagedReference

    @JsonIgnoreProperties("category")
    @OneToMany(mappedBy = "category")
    private List<Product> products;
}
