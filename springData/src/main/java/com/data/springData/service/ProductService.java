package com.data.springData.service;

import com.data.springData.dto.ProductDto;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductService {
    ProductDto save(ProductDto product);
    ProductDto edit(int id,ProductDto productDto);
    ProductDto delete(int id);
    ProductDto getById(int id);
    List<ProductDto> getProducts();
}
