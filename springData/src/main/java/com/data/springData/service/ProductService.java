package com.data.springData.service;

import com.data.springData.dto.ProductDto;
import com.data.springData.entity.Product;
import com.data.springData.repo.ProductRepo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductService {
    ProductDto save(ProductDto product);
    ProductDto edit(ProductDto product);
    ProductDto delete(int id);
    ProductDto getById(int id);
    List<ProductDto> getProducts();
}
