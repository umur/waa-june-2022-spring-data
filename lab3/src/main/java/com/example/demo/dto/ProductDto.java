package com.example.demo.dto;

import com.example.demo.entity.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.OneToMany;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {
  private int id;
  private String name;
  private long price;
  private  Category category;
}
