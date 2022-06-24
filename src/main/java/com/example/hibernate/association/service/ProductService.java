package com.example.hibernate.association.service;


import com.example.hibernate.association.dto.ProductDto;
import com.example.hibernate.association.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();
    List<Product> findAllByPriceGreaterThan(Double price);
    Product findById(int id);
    Product addProduct(ProductDto productDto);
    Product updateProduct(Product product);
    void deleteById(int id);

}
