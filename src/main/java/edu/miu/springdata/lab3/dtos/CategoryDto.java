package edu.miu.springdata.lab3.dtos;

import edu.miu.springdata.lab3.entity.Product;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Data
public class CategoryDto {

    private int id;
    private String name;

    private List<Product> products;
}
