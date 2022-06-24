package edu.miu.springdata.lab3.controllers;

import edu.miu.springdata.lab3.dtos.CategoryDto;
import edu.miu.springdata.lab3.entity.Category;
import edu.miu.springdata.lab3.services.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.annotation.RequestScope;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/categories")
public class CategoryController {
    private final CategoryService categoryService;

    @PostMapping
<<<<<<< HEAD
    public void save(@RequestBody CategoryDto p) {
        categoryService.save(p);
=======
    public void save(@RequestBody CategoryDto categoryDto) {
        categoryService.save(categoryDto);
>>>>>>> origin
    }

    @GetMapping
    public List<CategoryDto> getAll() {
        return categoryService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CategoryDto> getById(@PathVariable int id) {
<<<<<<< HEAD
        var product = categoryService.getById(id);
        return ResponseEntity.ok(product);
=======
        var category = categoryService.getById(id);
        return ResponseEntity.ok(category);
    }

    @PostMapping("/{id}")
    public ResponseEntity<CategoryDto> update(@PathVariable int id, @RequestBody CategoryDto categoryDto) {
        var category = categoryService.update(id, categoryDto);
        return ResponseEntity.ok(category);
>>>>>>> origin
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        categoryService.delete(id);
    }
}
