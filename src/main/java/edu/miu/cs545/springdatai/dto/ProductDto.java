package edu.miu.cs545.springdatai.dto;

import edu.miu.cs545.springdatai.entity.Category;

import java.io.Serializable;

public class ProductDto implements Serializable {
    private Integer id;
    private String name;
    private double price;
    private double rating;
    private Category categories;
}
