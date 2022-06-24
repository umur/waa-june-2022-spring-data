package edu.miu.cs545.springdatai.repo;

import edu.miu.cs545.springdatai.dto.CategoryDto;
import edu.miu.cs545.springdatai.service.CategoryService;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CategoryRepo {

    private static List<CategoryDto> categoryRepos;

    public CategoryDto createCategory(CategoryDto categoryDto) {
        categoryRepos.add(categoryDto);
        return categoryDto;
    }

    public List<CategoryDto> getAllCategories() {
        return categoryRepos;
    }
}
