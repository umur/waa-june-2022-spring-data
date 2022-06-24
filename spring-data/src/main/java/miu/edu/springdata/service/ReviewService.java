package miu.edu.springdata.service;

import miu.edu.springdata.dto.ReviewDto;

import java.util.List;

public interface ReviewService {
    List<ReviewDto> findAll();
    void create(ReviewDto review);
    ReviewDto update(ReviewDto review, int id);
    void delete(int id);
}
