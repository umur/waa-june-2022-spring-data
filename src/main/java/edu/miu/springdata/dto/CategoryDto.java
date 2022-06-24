package edu.miu.springdata.dto;


import edu.miu.springdata.entity.Product;
import lombok.Data;

import java.util.List;

@Data
public class CategoryDto {

    private int id;
    private String name;
    private List<Product> products;
}
