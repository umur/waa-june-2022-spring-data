package com.example.datai.service.impl;

import com.example.datai.dto.ProductDto;
import com.example.datai.entity.Product;
import com.example.datai.repository.ProductRepo;
import com.example.datai.service.ProductService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepo productRepo;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<ProductDto> finalAllProductGreaterMinPrice(double minPrice) {

        List<ProductDto> products = new ArrayList<>();

       for(Product product : productRepo.findAll()){
         if(product.getPrice() > minPrice){
             var dto = modelMapper.map(product,ProductDto.class);
             products.add(dto);
         }
      }
       return products;
    }

    @Override
    public List<ProductDto> findByKeyWord(String keyWord) {

        List<ProductDto> productDtos = new ArrayList<>();

       for(Product product: productRepo.findAll()){
           if(product.getName().contains(keyWord)){
               var dto = modelMapper.map(product,ProductDto.class);
               productDtos.add(dto);
           }
       }
       return productDtos;
    }
}
