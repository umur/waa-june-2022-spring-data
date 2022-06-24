package edu.miu.cs545.springdatai.repo;

import edu.miu.cs545.springdatai.entity.Category;
import edu.miu.cs545.springdatai.entity.Product;
import edu.miu.cs545.springdatai.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends CrudRepository<Product,Integer>{
    List<Product> findAll();
    Product findById(int id);
}
