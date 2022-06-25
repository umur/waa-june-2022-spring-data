package edu.miu.cs545.jointable.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import edu.miu.cs545.jointable.entity.Category;

import java.util.List;

@Repository
public interface CategoryRepo extends CrudRepository<Category,Integer> {
    List<Category> findAll();
    Category findById(int id);
}
