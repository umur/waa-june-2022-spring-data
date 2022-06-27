package com.example.lab3.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {
    String name;
    double price;
    double rating;
    int categoryId;
    int userId;
}
