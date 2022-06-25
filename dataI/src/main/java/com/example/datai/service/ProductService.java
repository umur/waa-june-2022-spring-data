package com.example.datai.service;

import com.example.datai.dto.ProductDto;
import com.example.datai.entity.Product;

import java.util.List;

public interface ProductService {

    List<ProductDto> finalAllProductGreaterMinPrice(double minPrice);

    List<ProductDto> findByKeyWord(String keyWord);

    List<ProductDto> findAllCategories();
}
