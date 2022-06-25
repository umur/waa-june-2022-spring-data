package edu.miu.cs545.jointable.repo;

import edu.miu.cs545.jointable.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends CrudRepository<Product,Integer>{
    List<Product> findAll();
    Product findById(int id);
}
