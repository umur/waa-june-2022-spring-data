package com.cs545waa.lab03.dto;

import com.cs545waa.lab03.entity.Product;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class CategoryDTO {
    private int id;
    private String name;
    private List<Product> products;
}
