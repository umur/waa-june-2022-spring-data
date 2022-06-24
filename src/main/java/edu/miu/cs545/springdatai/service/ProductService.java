package edu.miu.cs545.springdatai.service;

import edu.miu.cs545.springdatai.dto.ProductDto;

import java.util.List;

public interface ProductService {
    ProductDto createProduct(ProductDto productDto);

    List<ProductDto> getAllProducts();

    ProductDto updateProduct(int id, ProductDto productDto);

    ProductDto deleteProduct(int id);
}
