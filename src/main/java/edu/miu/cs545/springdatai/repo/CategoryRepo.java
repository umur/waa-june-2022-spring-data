package edu.miu.cs545.springdatai.repo;

import edu.miu.cs545.springdatai.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import edu.miu.cs545.springdatai.entity.Category;

import java.util.List;

@Repository
public interface CategoryRepo extends CrudRepository<Category,Integer> {
    List<Category> findAll();
    Category findById(int id);
}
