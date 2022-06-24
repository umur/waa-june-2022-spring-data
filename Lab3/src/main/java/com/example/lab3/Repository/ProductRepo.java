package com.example.lab3.Repository;

import com.example.lab3.model.bidirectional.ProductBi;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepo extends CrudRepository<ProductBi, Long> {
}
