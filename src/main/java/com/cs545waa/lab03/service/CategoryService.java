package com.cs545waa.lab03.service;

import com.cs545waa.lab03.dto.CategoryDTO;

import java.util.List;

public interface CategoryService {
    public void create(CategoryDTO dto);
    public void update(CategoryDTO dto);
    public void delete(int id);
    public CategoryDTO read(int id);
    public List<CategoryDTO> readAll();
}
