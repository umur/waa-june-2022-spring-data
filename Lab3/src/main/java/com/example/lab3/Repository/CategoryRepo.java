package com.example.lab3.Repository;

import com.example.lab3.model.bidirectional.CategoryBi;
import com.example.lab3.model.unidirectional.CategoryUni;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepo extends CrudRepository<CategoryBi,Long> {
}
