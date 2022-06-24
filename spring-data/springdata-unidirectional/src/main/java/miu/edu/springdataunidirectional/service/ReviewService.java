package miu.edu.springdataunidirectional.service;


import miu.edu.springdataunidirectional.dto.ReviewDto;

import java.util.List;

public interface ReviewService {
    List<ReviewDto> findAll();
    void create(ReviewDto review);
    ReviewDto update(ReviewDto review, int id);
    void delete(int id);
}
