package edu.miu.cs545.springdatai.dto;

import edu.miu.cs545.springdatai.entity.Product;

import java.io.Serializable;
import java.util.List;

@
public class CategoryDto implements Serializable {
    private Integer id;
    private String name;
    private List<Product> products;
}
