package com.example.lab3.bidirectional.service;

import com.example.lab3.bidirectional.dto.ReviewDTO;
import com.example.lab3.bidirectional.entity.Review;

import java.util.List;

public interface ReviewService {
    void save(Review review);

    void delete(int id);

    Review findById(int id);

    List<ReviewDTO> getAll();

    List<ReviewDTO> getReviewBasedOnProductId(int id);
}
