package com.example.lab3.Domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Catagory {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    @OneToMany(mappedBy = "catagory")
    private List<Product> products;
}
