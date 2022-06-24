package com.data.springData.service;

import com.data.springData.dto.CategoryDto;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryService {
    CategoryDto save(CategoryDto Category);

    CategoryDto edit(int id, CategoryDto Category);

    CategoryDto delete(int id);

    CategoryDto getById(int id);

    List<CategoryDto> getCategory();
}
