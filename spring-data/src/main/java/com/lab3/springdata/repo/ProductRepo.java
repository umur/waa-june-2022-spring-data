package com.lab3.springdata.repo;

import com.lab3.springdata.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends CrudRepository<Product, Integer> {
    List<Product> findAllByPriceGreaterThan(Double minPrice);
    List<Product> findByCategoryNameAndPriceLessThan(String categoryName, Double maxPrice);
    List<Product> findAllByNameContains(String key);
}
