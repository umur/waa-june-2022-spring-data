package edu.miu.springdata.controller;

import edu.miu.springdata.dto.CategoryDto;
import edu.miu.springdata.entity.Category;
import edu.miu.springdata.service.CategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoryController {
    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @PostMapping("/categories/")
    public void save(@RequestBody CategoryDto p) {
        categoryService.save(p);
    }

    @GetMapping("/categories/")
    public List<CategoryDto> getAll() {
        return categoryService.getAll();
    }

    @GetMapping("/categories/{id}")
    public Category getById(@PathVariable int id) {
        return categoryService.getById(id);
    }

    @DeleteMapping("/categories/{id}")
    public void delete(@PathVariable int id) {
        categoryService.delete(id);
    }

    @PutMapping("/categories/{id}")
    public void update(@PathVariable("id") int id, @RequestBody CategoryDto category) {
        categoryService.updateCategory(category, id);
    }
}
