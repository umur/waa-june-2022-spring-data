package com.data.springData.service.impl;

import com.data.springData.dto.CategoryDto;
import com.data.springData.entity.uniDirectional.Category;
import com.data.springData.repo.CategoryRepo;
import com.data.springData.service.CategoryService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryService {


    @Autowired
    private CategoryRepo CategoryRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public CategoryDto save(CategoryDto CategoryDto) {
        Category Category = new Category();
        Category = modelMapper.map(CategoryDto, Category.class);
        CategoryRepo.save(Category);
        return CategoryDto;
    }

    @Override
    public CategoryDto edit(int id,CategoryDto CategoryDto) {
        Category Category = new Category();
        Category = modelMapper.map(CategoryDto, Category.class);
        CategoryRepo.save(Category);
        return CategoryDto;
    }

    @Override
    public CategoryDto delete(int id) {
        Category pro = CategoryRepo.findById(id).get();
        CategoryRepo.deleteById(id);
        return modelMapper.map(pro, CategoryDto.class);
    }

    @Override
    public CategoryDto getById(int id) {
        Category pro = CategoryRepo.findById(id).get();
        return null;
    }

    @Override
    public List<CategoryDto> getCategory() {
        List<Category> pro = CategoryRepo.findAll();
        List<CategoryDto> CategoryDtos = new ArrayList<>();
        for (Category pr : pro) {
            CategoryDto dto = new CategoryDto();
            dto = modelMapper.map(pr, CategoryDto.class);
            CategoryDtos.add(dto);
        }
        return null;
    }
}
