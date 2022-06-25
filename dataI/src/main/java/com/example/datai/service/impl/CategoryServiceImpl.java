package com.example.datai.service.impl;

import com.example.datai.dto.CategoryDto;
import com.example.datai.dto.ProductDto;
import com.example.datai.entity.Category;
import com.example.datai.entity.Product;
import com.example.datai.repository.CategoryRepo;
import com.example.datai.service.CategoryService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepo categoryRep;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<ProductDto> findAllCategoryLessThanMaxPrice(String category1, double maxPrice) {

        List<ProductDto> categories = new ArrayList<>();
        var product = categoryRep.findAll();

        for (Category category : product) {
            if (category.getName().equals(category1)) {
                for (Product cat : category.getProducts()) {
                    if (cat.getPrice() < maxPrice) {
                        var dto = modelMapper.map(cat, ProductDto.class);
                        categories.add(dto);
                    }
                }
            }
        }
        return categories;
    }

    @Override
    public List<CategoryDto> findAllCategories() {

        List<CategoryDto> categoryDtos = new ArrayList<>();
        var cagtagory = categoryRep.findAll();

        for(Category car : cagtagory){
            categoryDtos.add(modelMapper.map(car,CategoryDto.class));
        }
        return categoryDtos;
    }
}
