package edu.miu.springdata.lab3.services;

import edu.miu.springdata.lab3.entity.Category;

import java.util.List;

public interface CategoryService {
    void save(Category p);

    void delete(int id);

    Category getById(int id);

    List<Category> getAll();
}
