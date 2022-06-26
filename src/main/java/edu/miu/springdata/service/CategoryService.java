package edu.miu.springdata.service;

import edu.miu.springdata.dto.CategoryDto;
import edu.miu.springdata.entity.Category;

import java.util.List;

public interface CategoryService {

    void save(CategoryDto category);

    public void updateCategory(CategoryDto category, Integer id);
    void delete(int id);

    Category getById(int id);

    List<CategoryDto> getAll();
}
