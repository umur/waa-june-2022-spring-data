package com.example.datai.service;

import com.example.datai.dto.ReviewDto;

import java.util.List;

public interface ReviewService {

    List<ReviewDto> findAllReviewOfProduct(long id);

    List<ReviewDto> fiindAllReviews();
}
