package edu.miu.springdata.lab3.repositories;


import edu.miu.springdata.lab3.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends CrudRepository<Product, Integer> {
    
    public List<Product> findByNameContaining(String name);
}