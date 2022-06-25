package com.cs545waa.lab03.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {
    private int id;
    private String name;
    private double price;
    private int rating;
    private CategoryDTO category;
    private AppUserDTO appUser;
}
