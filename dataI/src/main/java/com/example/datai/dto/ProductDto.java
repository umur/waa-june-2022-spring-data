package com.example.datai.dto;

import com.example.datai.entity.Category;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
public class ProductDto {

    private long id;
    private  String name;
    private double price;
    private int rating;
    private Category category;

}
