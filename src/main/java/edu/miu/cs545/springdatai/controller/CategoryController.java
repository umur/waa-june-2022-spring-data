package edu.miu.cs545.springdatai.controller;

import edu.miu.cs545.springdatai.dto.CategoryDto;
import edu.miu.cs545.springdatai.service.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
@AllArgsConstructor
public class CategoryController {
    private final CategoryService categoryService;

    @PostMapping
    public CategoryDto createCategory(@RequestBody CategoryDto categoryDto){
         return categoryService.createCategory(categoryDto);
    }

    @GetMapping
    public List<CategoryDto> getAllCategories(){
        return categoryService.getAllCategories();
    }

    @PutMapping("/{id}")
    public CategoryDto updateCategory(@PathVariable int id , @RequestBody CategoryDto categoryDto){
        return categoryService.updateCategory(id, categoryDto);
    }

    @DeleteMapping("/{id}")
    public CategoryDto deleteCategory(@PathVariable int id){
        return categoryService.deleteCategory(id);
    }

}
