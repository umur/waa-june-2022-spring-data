package miu.edu.springdata.controller;

import miu.edu.springdata.dto.CategoryDto;
import miu.edu.springdata.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @GetMapping
    public List<CategoryDto> findAll() {
        return categoryService.findAll();
    }

    @PostMapping
    public void create(@RequestBody CategoryDto category) {
        categoryService.createCategory(category);
    }

    @PutMapping("/{id}")
    public CategoryDto update(@RequestBody CategoryDto category, @PathVariable int id) {
        return categoryService.update(category, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        categoryService.delete(id);
    }
}
