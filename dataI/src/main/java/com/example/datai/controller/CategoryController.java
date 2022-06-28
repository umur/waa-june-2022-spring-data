package com.example.datai.controller;

import com.example.datai.dto.CategoryDto;
import com.example.datai.dto.ProductDto;
import com.example.datai.entity.Category;
import com.example.datai.service.CategoryService;
import com.example.datai.service.impl.CategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public List<CategoryDto> findAllCategoryDtos(){
        return categoryService.findAllCategories();
    }

//    @GetMapping
//    public List<ProductDto> findAllCategoryGreaterThanMaxPrice1(@RequestParam String category,@RequestParam double maxPrice){
//       return categoryService.findAllCategoryLessThanMaxPrice(category, maxPrice);
//    }

//    //TODO ------
//    @GetMapping("/{maxPrice}")
//    public List<ProductDto> findAllCategoriesLessThanMaxPrice( String cat, @RequestParam double maxPrice) {
//        return categoryService.findAllCategoryLessThanMaxPrice(cat, maxPrice);
//    }
}
