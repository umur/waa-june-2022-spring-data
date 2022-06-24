package com.example.datai.controller;

import com.example.datai.dto.ProductDto;
import com.example.datai.entity.Category;
import com.example.datai.service.impl.CategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    private CategoryServiceImpl  categoryService;

    @GetMapping("/{maxPrice}")
    public List<ProductDto> findAllCategoriesLessThanMaxPrice( String cat, @RequestParam double maxPrice){
        return  categoryService.findAllCategoryLessThanMaxPrice(cat, maxPrice);
    }
}
