package edu.miu.springdata.service;


import edu.miu.springdata.dto.ProductDto;
import edu.miu.springdata.entity.Product;

import java.util.List;

public interface ProductService {

    void save(ProductDto p);

    public void updateProduct(ProductDto product, Integer id);

    void delete(int id);

    Product getById(int id);

    List<ProductDto> getAll();
}
