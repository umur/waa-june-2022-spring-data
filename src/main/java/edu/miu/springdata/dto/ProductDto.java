package edu.miu.springdata.dto;

import edu.miu.springdata.entity.Category;
import edu.miu.springdata.entity.Review;
import lombok.Data;

import java.util.List;

@Data
public class ProductDto {

    private int id;
    private String name;
    private float price;
    private double rating;
    private Category category;
    private List<Review> reviews;

}
