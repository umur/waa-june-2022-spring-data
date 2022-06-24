package edu.miu.cs545.springdatai.service.implementation;

import edu.miu.cs545.springdatai.dto.CategoryDto;
import edu.miu.cs545.springdatai.repo.CategoryRepo;
import edu.miu.cs545.springdatai.service.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepo categoryRepo;


    @Override
    public CategoryDto createCategory(CategoryDto categoryDto) {
        return categoryRepo.createCategory(categoryDto);
    }

    @Override
    public List<CategoryDto> getAllCategories() {
        return categoryRepo.getAllCategories();
    }

    @Override
    public CategoryDto updateCategory(int id, CategoryDto categoryDto) {
        return categoryRepo.updateCategory(id, categoryDto);
    }

    @Override
    public CategoryDto deleteCategory(int id) {
        return categoryRepo.deleteCategory(id);
    }
}
