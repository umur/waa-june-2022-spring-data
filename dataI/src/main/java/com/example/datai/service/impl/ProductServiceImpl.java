package com.example.datai.service.impl;

import com.example.datai.dto.ProductDto;
import com.example.datai.entity.Product;
import com.example.datai.repository.ProductRepo;
import com.example.datai.service.ProductService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepo productRepo;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<ProductDto> finalAllProductGreaterMinPrice(double minPrice) {

        List<ProductDto> products = new ArrayList<>();
        var prod = productRepo.findAll();

        for (Product product : prod) {
            if (product.getPrice() > minPrice) {
                var dto = modelMapper.map(product, ProductDto.class);
                products.add(dto);
            }
        }
        return products;
    }

    @Override
    public List<ProductDto> findByKeyWord(String keyWord) {

        List<ProductDto> productDtos = new ArrayList<>();
        var prod = productRepo.findAll();

        for (Product product : prod) {
            if (product.getName().contains(keyWord)) {
                var dto = modelMapper.map(product, ProductDto.class);
                productDtos.add(dto);
            }
        }
        return productDtos;
    }

    @Override
    public List<ProductDto> findAllCategories() {

        List<ProductDto> productDtos = new ArrayList<>();
        var prod = productRepo.findAll();

        for(Product product: prod){
            productDtos.add(modelMapper.map(product,ProductDto.class));
        }
        return productDtos;
    }
}
