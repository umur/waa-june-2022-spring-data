package com.example.datai.service.impl;

import com.example.datai.dto.ReviewDto;
import com.example.datai.entity.Product;
import com.example.datai.entity.Review;
import com.example.datai.repository.ProductRepo;
import com.example.datai.service.ReviewService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class ReviewServiceImpl implements ReviewService {

    @Autowired
    private ProductRepo productRepo;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<ReviewDto> findAllReviewOfProduct(long id) {

        List<ReviewDto> reviewDtos = new ArrayList<>();

       for(Product product: productRepo.findAll()){
            if(product.getId() == id){
               for(Review review: product.getReviews()) {
                    var dto = modelMapper.map(review, ReviewDto.class);
                    reviewDtos.add(dto);
                }
            }
        }
       return reviewDtos;
    }
}
