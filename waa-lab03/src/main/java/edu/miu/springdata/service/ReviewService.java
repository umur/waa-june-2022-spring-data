package edu.miu.springdata.service;

import edu.miu.springdata.dto.ProductDto;
import edu.miu.springdata.dto.ReviewDto;

import java.util.List;

public interface ReviewService {
    List<ReviewDto> findReviewByProductId(int productId);
}
