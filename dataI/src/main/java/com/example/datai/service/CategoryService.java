package com.example.datai.service;

import com.example.datai.dto.CategoryDto;
import com.example.datai.dto.ProductDto;
import com.example.datai.entity.Category;
import com.example.datai.entity.Product;

import java.util.List;

public interface CategoryService {

    List<ProductDto> findAllCategoryLessThanMaxPrice(String category, double maxPrice);

    List<CategoryDto> findAllCategories();
}
