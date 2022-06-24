package miu.edu.springdataunidirectional.repo;

import miu.edu.springdataunidirectional.model.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepo extends CrudRepository<Category, Integer> {
}
