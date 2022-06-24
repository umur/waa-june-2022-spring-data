package miu.edu.unimapping.service;

import miu.edu.unimapping.dto.ProductDto;
import miu.edu.unimapping.dto.ReviewDto;
import miu.edu.unimapping.entity.Product;
import miu.edu.unimapping.entity.Review;

import java.util.Collection;
import java.util.List;

public interface ReviewService {
    public List<ReviewDto> getAllReview();

    public Review addReview(ReviewDto reviewDtoDto);

    public void deleteReview(Integer id);

    public Review updateReview(ReviewDto reviewDto, Integer id);
}
