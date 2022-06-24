package com.lab3.springdata.repo;

import com.lab3.springdata.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepo extends CrudRepository<Category, Integer> {
}
