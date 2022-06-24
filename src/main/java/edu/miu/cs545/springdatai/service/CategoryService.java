package edu.miu.cs545.springdatai.service;

import edu.miu.cs545.springdatai.dto.CategoryDto;

import java.util.List;

public interface CategoryService {
    public CategoryDto createCategory(CategoryDto categoryDto);

    List<CategoryDto> getAllCategories();
}
