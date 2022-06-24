package com.lab3.springdata.service;

import com.lab3.springdata.dto.ProductDto;
import com.lab3.springdata.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> findAll();

    void create(Product product);

    void delete(int id);

    ProductDto getById(int id);

    List<Product> findAllByPriceGreaterThan(Double minPrice);

    List<Product> findByCategoryNameAndPriceLessThan(String categoryName, Double maxPrice);

    List<Product> findAllByNameContains(String keyword);
}
