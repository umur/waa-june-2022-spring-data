package edu.miu.springdata.lab3.repositories;

import edu.miu.springdata.lab3.entity.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepo extends CrudRepository<Category, Integer> {
}
