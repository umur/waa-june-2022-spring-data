package edu.miu.springdata.lab3.services;

import edu.miu.springdata.lab3.dtos.CategoryDto;

import java.util.List;

public interface CategoryService {
    void save(CategoryDto p);

    void delete(int id);

    CategoryDto getById(int id);

    List<CategoryDto> getAll();

    CategoryDto update(CategoryDto categoryDto, int id);
}
