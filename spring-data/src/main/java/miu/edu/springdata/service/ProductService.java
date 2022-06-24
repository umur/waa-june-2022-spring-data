package miu.edu.springdata.service;

import miu.edu.springdata.dto.ProductDto;

import java.util.List;

public interface ProductService {
    List<ProductDto> findAll();
    void create(ProductDto product);
    ProductDto update(ProductDto product, int id);
    void delete(int id);

}
