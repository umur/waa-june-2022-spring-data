package edu.miu.cs545.springdatai.service.implementation;

import edu.miu.cs545.springdatai.dto.ProductDto;
import edu.miu.cs545.springdatai.repo.ProductRepo;
import edu.miu.cs545.springdatai.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepo productRepo;
    @Override
    public ProductDto createProduct(ProductDto productDto) {
        return productRepo.createProduct(productDto);
    }

    @Override
    public List<ProductDto> getAllProducts() {
        return productRepo.getAllProducts();
    }

    @Override
    public ProductDto updateProduct(int id, ProductDto productDto) {
        return productRepo.updateProduct(id, productDto);
    }

    @Override
    public ProductDto deleteProduct(int id) {
        return productRepo.deleteProduct(id);
    }
}
