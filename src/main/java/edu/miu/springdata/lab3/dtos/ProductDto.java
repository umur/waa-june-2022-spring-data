package edu.miu.springdata.lab3.dtos;

import edu.miu.springdata.lab3.entity.Category;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class ProductDto {
    private int id;
    private String name;
    private double price;
    private float rating;

    private Category category;
}
