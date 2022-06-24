package com.data.springData.entity.uniDirectional;

import javax.persistence.*;

@Entity(name = "ProductBi")
@Table(name = "ProductBi")
public class Product {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private double price;
    private float rating;
}
