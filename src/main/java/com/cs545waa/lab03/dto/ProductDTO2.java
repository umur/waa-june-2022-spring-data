package com.cs545waa.lab03.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO2 {
    private int id;
    private String name;
    private double price;
    private int rating;
    private int category_id;
    private int app_user_id;
}
