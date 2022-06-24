package edu.miu.cs545.springdatai.service;

import edu.miu.cs545.springdatai.dto.CategoryDto;

import java.util.List;

public interface CategoryService {
    CategoryDto createCategory(CategoryDto categoryDto);

    List<CategoryDto> getAllCategories();

    CategoryDto updateCategory(int id, CategoryDto categoryDto);

    CategoryDto deleteCategory(int id);

}
