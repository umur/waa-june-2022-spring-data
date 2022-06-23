package edu.miu.springdata.lab3.repositories;

import edu.miu.springdata.lab3.entity.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepo extends CrudRepository<Category, Integer> {
}
