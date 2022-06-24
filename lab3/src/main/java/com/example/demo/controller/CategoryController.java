package com.example.demo.controller;

import com.example.demo.dto.CategoryDto;
import com.example.demo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")

public class CategoryController {
  @Autowired
  CategoryService categoryService;

  @GetMapping
  public List<CategoryDto> findAllCategory() {

    return categoryService.findAllCategory();
  }

  @PostMapping
  public void createCategory(@RequestBody CategoryDto dto) {
    categoryService.createCategory(dto);
  }

  @DeleteMapping("/{id}")
  public void deleteCategory(@PathVariable int id) {
    categoryService.delete(id);
  }

  @PutMapping("/{id}")

  public void update(@RequestBody @PathVariable int id, CategoryDto categoryDto) {

    categoryService.update(id, categoryDto);
  }
}
