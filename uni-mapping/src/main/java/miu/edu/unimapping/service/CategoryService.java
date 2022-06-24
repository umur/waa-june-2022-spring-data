package miu.edu.unimapping.service;

import miu.edu.unimapping.dto.CategoryDto;
import miu.edu.unimapping.entity.Category;

import java.util.Collection;

public interface CategoryService {
    public Collection<CategoryDto> getAllCategory();

    public Category addCategory(CategoryDto categoryDto);

    public void deleteCategory(Integer id);

    public Category updateCategory(CategoryDto categoryDto, Integer id);
}
