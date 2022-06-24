package com.data.springData.service.impl;

import com.data.springData.dto.ProductDto;
import com.data.springData.entity.uniDirectional.Product;
import com.data.springData.repo.ProductRepo;
import com.data.springData.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepo productRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public ProductDto save(ProductDto productDto) {
        Product product = new Product();
        product = modelMapper.map(productDto, Product.class);
        productRepo.save(product);
        return productDto;
    }

    @Override
    public ProductDto edit(int id,ProductDto productDto) {
        Product product = new Product();
        product = modelMapper.map(productDto, Product.class);
        productRepo.save(product);
        return productDto;
    }

    @Override
    public ProductDto delete(int id) {
        Product pro = productRepo.findById(id).get();
        productRepo.deleteById(id);
        return modelMapper.map(pro, ProductDto.class);
    }

    @Override
    public ProductDto getById(int id) {
        Product pro = productRepo.findById(id).get();
        return null;
    }

    @Override
    public List<ProductDto> getProducts() {
        List<Product> pro = productRepo.findAll();
        List<ProductDto> productDtos = new ArrayList<>();
        for (Product pr : pro) {
            ProductDto dto = new ProductDto();
            dto = modelMapper.map(pr, ProductDto.class);
            productDtos.add(dto);
        }
        return null;
    }
}
