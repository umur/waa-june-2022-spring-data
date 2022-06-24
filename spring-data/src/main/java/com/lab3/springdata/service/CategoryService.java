package com.lab3.springdata.service;

import com.lab3.springdata.dto.CategoryDto;

import java.util.List;

public interface CategoryService {

    List<CategoryDto> findAll();

    void create(CategoryDto categoryDto);

    void delete(int id);

    CategoryDto getById(int id);
}
