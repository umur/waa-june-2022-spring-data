package edu.miu.cs545.springdatai.repo;

import edu.miu.cs545.springdatai.dto.CategoryDto;
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

    public CategoryDto updateCategory(int id, CategoryDto categoryDto) {
        for(CategoryDto cd:categoryRepos){
            if(cd.getId()==id){
                categoryRepos.remove(cd);
                categoryRepos.add(categoryDto);
                return categoryDto;
            }
        }
        return null;
    }

    public CategoryDto deleteCategory(int id) {
        for(CategoryDto cd:categoryRepos){
            if(cd.getId()==id){
                categoryRepos.remove(cd);
                return cd;
            }
        }
        return null;
    }
}
