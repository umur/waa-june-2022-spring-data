package edu.miu.springdata.lab3.services.impl;


import edu.miu.springdata.lab3.dtos.ProductDto;
import edu.miu.springdata.lab3.dtos.ReviewDto;
import edu.miu.springdata.lab3.dtos.UserDto;
import edu.miu.springdata.lab3.entity.Product;
import edu.miu.springdata.lab3.entity.Review;
import edu.miu.springdata.lab3.entity.User;
import edu.miu.springdata.lab3.repositories.ProductRepo;
import edu.miu.springdata.lab3.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    @Autowired
    private final ProductRepo productRepo;

    @Autowired
    private final ModelMapper modelMapper;

    @Override
    public void save(ProductDto p) {
        productRepo.save(modelMapper.map(p, Product.class));
    }

    @Override
    public void delete(int id) {
        productRepo.deleteById(id);
    }

    @Override
    public void update(ProductDto productDto, int id) {
        return;
    }

    @Override
    public ProductDto getById(int id) {
        return modelMapper.map(productRepo.findById(id).get(), ProductDto.class);
    }

    @Override
    public List<ProductDto> getAll() {
        return StreamSupport.stream(productRepo.findAll().spliterator(), false)
                .map(u -> modelMapper.map(u, ProductDto.class))
                .collect(Collectors.toList());
    }


    @Override
    public List<ProductDto> getWithMinPrice() {
        return null;
    }

    @Override
    public List<ReviewDto> getReviewsFromProductId(int productId) {
//        Product product = (Product) productRepo.findById(productId).get();
//        return product.getReviews();
        return null;
    }

    @Override
    public List<ProductDto> getByName(String name) {
        return StreamSupport.stream(productRepo.findByNameContaining(name).spliterator(), false)
                .map(p -> modelMapper.map(p, ProductDto.class))
                .collect(Collectors.toList());
    }
}

