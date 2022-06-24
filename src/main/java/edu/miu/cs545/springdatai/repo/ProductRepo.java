package edu.miu.cs545.springdatai.repo;

import edu.miu.cs545.springdatai.dto.ProductDto;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductRepo {
    private static List<ProductDto> productDtos;

    public ProductDto createProduct(ProductDto productDto) {
        productDtos.add(productDto);
        return productDto;
    }

    public List<ProductDto> getAllProducts() {
        return productDtos;
    }
}
