package miu.edu.springdataunidirectional.service;

import miu.edu.springdata.dto.CategoryDto;
import miu.edu.springdata.dto.ProductDto;

import java.util.List;

public interface ProductService {
    List<ProductDto> findAll();
    void create(ProductDto product);
    ProductDto update(ProductDto product, int id);
    void delete(int id);

    List<ProductDto> findAllByMinPrice(double price);
    List<ProductDto> findAllByCategoryAndPrice(CategoryDto category, double price);
    List<ProductDto> findAllByNameContains(String name);
}
