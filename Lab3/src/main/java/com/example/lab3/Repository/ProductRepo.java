package com.example.lab3.Repository;

import com.example.lab3.model.bidirectional.ProductBi;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<ProductBi, Long> {
}
