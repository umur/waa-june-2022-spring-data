package com.example.datai.dto;

import com.example.datai.entity.Category;
import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
@Component
public class ProductDto {

    private long id;
    private String name;
    private double price;
    private int rating;


}
