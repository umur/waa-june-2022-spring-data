package com.lab3.springdata.service.impl;

import com.lab3.springdata.dto.CategoryDto;
import com.lab3.springdata.model.Category;
import com.lab3.springdata.repo.CategoryRepo;
import com.lab3.springdata.service.CategoryService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    private CategoryRepo categoryRepo;

    private ModelMapper modelMapper;

    public CategoryServiceImpl(CategoryRepo categoryRepo ,ModelMapper modelMapper){
        this.categoryRepo = categoryRepo;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<CategoryDto> findAll() {
        List<Category> categories = (List<Category>) categoryRepo.findAll();
        List<CategoryDto> categoryDtos = new ArrayList<>();
        categories.forEach(c-> {
            CategoryDto dto = new CategoryDto();
            var categoryDto = dto.toDto(c);
            categoryDtos.add(categoryDto);
        });
        return categoryDtos;
    }

    @Override
    public void create(CategoryDto categoryDto) {
        var entity = categoryDto.toEntity();
        categoryRepo.save(entity);
    }

    @Override
    public void delete(int id) {
        categoryRepo.deleteById(id);
    }

    @Override
    public CategoryDto getById(int id) {
        var category = categoryRepo.findById(id).orElseThrow(()-> new RuntimeException(String.format("Not found")));
        return modelMapper.map(category, CategoryDto.class);
    }
}
