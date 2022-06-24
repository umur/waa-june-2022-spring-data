package com.data.springData.controller;

import com.data.springData.dto.CategoryDto;
import com.data.springData.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Category")
public class CategoryController {

    private CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @PostMapping()
    public CategoryDto save(@RequestBody CategoryDto categoryDto) {
        return categoryService.save(categoryDto);
    }

    @PutMapping("/{id}")
    public CategoryDto update(@PathVariable int id, @RequestBody CategoryDto categoryDto) {
        return categoryService.edit(id, categoryDto);
    }

    @GetMapping()
    public List<CategoryDto> getAll() {
        return categoryService.getCategory();
    }

    @DeleteMapping("/{id}")
    public CategoryDto delete(@PathVariable int id) {
        return categoryService.delete(id);
    }
}
