package edu.miu.springdata.service;

import edu.miu.springdata.dto.ReviewDto;
import edu.miu.springdata.entity.Review;

import java.util.List;

public interface ReviewService {
    void save(ReviewDto review);

    public void updateReview(ReviewDto review, Integer id);
    void delete(int id);

    Review getById(int id);

    List<ReviewDto> getAll();
}
