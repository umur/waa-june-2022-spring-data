package com.waa.lab3.service;

import com.waa.lab3.entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> findProductByPriceGreaterThan(Double minPrice);

    List<Product> findProductByPriceLessThanAndCategoryName(Double maxPrice, String categoryName);

    List<Product> findProductByNameContaining(String keyword);

    List<Product> findProductByUserId(Long userId);

}
