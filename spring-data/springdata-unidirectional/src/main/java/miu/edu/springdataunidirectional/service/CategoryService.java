package miu.edu.springdataunidirectional.service;

import miu.edu.springdata.dto.CategoryDto;

import java.util.List;

public interface CategoryService {
    List<CategoryDto> findAll();
    void createCategory(CategoryDto category);
    CategoryDto update(CategoryDto category, int id);
    void delete(int id);
}
