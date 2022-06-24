package com.example.hibernate.jointable.service;
import com.example.hibernate.jointable.dto.ProductDto;
import com.example.hibernate.jointable.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();
    Product findById(int id);
    Product addProduct(ProductDto productDto);
    Product updateProduct(Product product);
    void deleteById(int id);

}
