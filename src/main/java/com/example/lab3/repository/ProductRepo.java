package com.example.lab3.repository;
import com.example.lab3.entity.Category;
import com.example.lab3.entity.Product;
import com.example.lab3.entity.Review;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends CrudRepository<Product, Integer> {
    List<Product> findAllByPriceGreaterThan(double price);
    List<Product> findAllByPriceLessThanAndCategoryEquals(double price, String category);
    List<Product> findAllByNameContainsIgnoreCase(String keyword);

    List<Product> findAllByUserId(int id);

}
