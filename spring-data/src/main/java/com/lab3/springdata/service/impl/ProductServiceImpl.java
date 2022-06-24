package com.lab3.springdata.service.impl;

import com.lab3.springdata.dto.ProductDto;
import com.lab3.springdata.model.Product;
import com.lab3.springdata.repo.ProductRepo;
import com.lab3.springdata.service.ProductService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepo productRepo;

    private ModelMapper modelMapper;

    public ProductServiceImpl(ProductRepo productRepo, ModelMapper modelMapper) {
        this.productRepo = productRepo;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<Product> findAll() {
        List<Product> products = new ArrayList<>();
        productRepo.findAll().forEach(product -> {products.add(product);});
        return products;
    }

    @Override
    public void create(Product product) {
        productRepo.save(product);
    }

    @Override
    public void delete(int id) {
        productRepo.deleteById(id);
    }

    @Override
    public ProductDto getById(int id) {
        var product = productRepo.findById(id).orElseThrow(()-> new RuntimeException(String.format("Not found")));
        return modelMapper.map(product, ProductDto.class);
    }

    @Override
    public List<Product> findAllByPriceGreaterThan(Double minPrice) {
        var products = productRepo.findAllByPriceGreaterThan(minPrice);
        return products;
    }

    @Override
    public List<Product> findByCategoryNameAndPriceLessThan(String categoryName, Double maxPrice) {
        var products = productRepo.findByCategoryNameAndPriceLessThan(categoryName, maxPrice);
        return products;
    }

    @Override
    public List<Product> findAllByNameContains(String keyword) {
        var products = productRepo.findAllByNameContains(keyword);
        return products;
    }

}
