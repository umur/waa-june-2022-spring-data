package com.lab3.springdata.service;

import com.lab3.springdata.dto.ReviewDto;

import java.util.List;

public interface ReviewService {
    List<ReviewDto> findAll();

    ReviewDto create(ReviewDto reviewDto);

    ReviewDto findById(int id);

    void delete(int id);
}
