package com.example.hibernate.joincolumn.service;

import com.example.hibernate.joincolumn.dto.ProductDto;
import com.example.hibernate.joincolumn.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();
    Product findById(int id);
    Product addProduct(ProductDto productDto);
    Product updateProduct(Product product);
    void deleteById(int id);

}
