package miu.edu.springdata.dto;

import miu.edu.springdata.model.Product;

import javax.persistence.OneToMany;
import java.util.List;

public class CategoryDto {
    private int id;
    private String name;
    private List<Product> products;
}
