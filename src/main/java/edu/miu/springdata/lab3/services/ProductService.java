package edu.miu.springdata.lab3.services;


import edu.miu.springdata.lab3.dtos.ProductDto;
import edu.miu.springdata.lab3.dtos.ReviewDto;

import java.util.List;

public interface ProductService {
    void save(ProductDto p);

    void delete(int id);

    void update(ProductDto productDto, int id);
    ProductDto getById(int id);

    List<ProductDto> getAll();

    List<ProductDto> getWithMinPrice();
    List<ReviewDto> getReviewsFromProductId(int productId);

    List<ProductDto> getByName(String name);
}
