package edu.miu.springdata.lab3.services.impl;

import edu.miu.springdata.lab3.entity.Category;
import edu.miu.springdata.lab3.repositories.CategoryRepo;
import edu.miu.springdata.lab3.services.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepo categoryRepo;
    @Override
    public void save(Category p) {
        categoryRepo.save(p);
    }

    @Override
    public void delete(int id) {
        categoryRepo.deleteById(id);
    }

    @Override
    public Category getById(int id) {
        return (Category) categoryRepo.findById(id).get();
    }

    @Override
    public List<Category> getAll() {
        return StreamSupport.stream(categoryRepo.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }
}
