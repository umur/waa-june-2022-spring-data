package edu.miu.cs545.springdatai.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductDto {
    int id;
    String name;
    double price;
    double rating;
}
