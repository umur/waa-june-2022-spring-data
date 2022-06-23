package edu.miu.springdata.lab3.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.OneToOne;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    private int id;
    private String name;
    private double price;
    private float rating;

    @OneToOne
    private Category category;
}
