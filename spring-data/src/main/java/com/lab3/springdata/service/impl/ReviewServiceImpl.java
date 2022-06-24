package com.lab3.springdata.service.impl;

import com.lab3.springdata.dto.ReviewDto;
import com.lab3.springdata.model.Review;
import com.lab3.springdata.repo.ReviewRepo;
import com.lab3.springdata.service.ReviewService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService {

    private final ReviewRepo reviewRepo;
    private final ModelMapper modelMapper;

    public ReviewServiceImpl(ReviewRepo reviewRepo, ModelMapper modelMapper) {
        this.reviewRepo = reviewRepo;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<ReviewDto> findAll() {
        List<Review> reviews = new ArrayList<>();
        List<ReviewDto> reviewDtos = new ArrayList<>();
        reviewRepo.findAll().forEach(r-> {
            reviews.add(r);
        });
        reviews.forEach(r1-> {
            var result = modelMapper.map(r1, ReviewDto.class);
            reviewDtos.add(result);
        });
        return reviewDtos;
    }

    @Override
    public ReviewDto create(ReviewDto reviewDto) {
        var review = modelMapper.map(reviewDto, Review.class);
        return modelMapper.map(reviewRepo.save(review), ReviewDto.class);
    }

    @Override
    public ReviewDto findById(int id) {
        Review review = reviewRepo.findById(id).orElseThrow(() -> new RuntimeException(String.format("Not found")));
        return modelMapper.map(review, ReviewDto.class);
    }

    @Override
    public void delete(int id) {reviewRepo.deleteById(id);}
}
