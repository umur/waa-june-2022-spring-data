package com.waa.lab3.repo;

import com.waa.lab3.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findProductByPriceGreaterThan(Double minPrice);

    List<Product> findProductByPriceLessThanAndCategoryName(Double maxPrice, String categoryName);

    List<Product> findProductByNameContaining(String keyword);

    List<Product> findProductByUserId(Long userId);
}
