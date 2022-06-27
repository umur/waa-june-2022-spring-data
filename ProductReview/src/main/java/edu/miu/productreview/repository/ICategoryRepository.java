package edu.miu.productreview.repository;

import edu.miu.productreview.model.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategoryRepository extends CrudRepository<Category, Integer> {
}
