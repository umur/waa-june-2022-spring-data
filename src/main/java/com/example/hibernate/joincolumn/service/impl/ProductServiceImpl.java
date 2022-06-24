package com.example.hibernate.joincolumn.service.impl;

import com.example.hibernate.joincolumn.dto.ProductDto;
import com.example.hibernate.joincolumn.entity.Product;
import com.example.hibernate.joincolumn.repo.ProductRepo;
import com.example.hibernate.joincolumn.service.ProductService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepo productRepo;
    @Autowired
    private ModelMapper modelMapper;

    public List<Product> findAll() {
        return (List<Product>) productRepo.findAll();
    }

    public Product findById(int id) {
       return productRepo.findById(id).get();
    }

    public Product addProduct(ProductDto productDto) {
       return productRepo.save(modelMapper.map(productDto, Product.class));
    }

    public Product updateProduct(Product product){
        return productRepo.save(product);
    }

    public void deleteById(int id){
        productRepo.deleteById(id);
    }
}
