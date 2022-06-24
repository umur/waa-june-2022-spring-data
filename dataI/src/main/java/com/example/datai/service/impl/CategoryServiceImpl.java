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
    public List<ProductDto> findAllCategoryLessThanMaxPrice(Category category1, double maxPrice) {

        List<ProductDto> categories = new ArrayList<>();

        for(Category category : categoryRep.findAll()){
            if(category.getName().equals(category1.getName())){
                for(Product cat : category.getProducts()){
                    if(cat.getPrice() < maxPrice) {
                        var dto = modelMapper.map(cat, ProductDto.class);
                        categories.add(dto);
                    }
                }
            }
        }
        return categories;
    }
}
