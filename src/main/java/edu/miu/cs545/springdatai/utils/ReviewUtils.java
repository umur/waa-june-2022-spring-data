package edu.miu.cs545.springdatai.utils;

import edu.miu.cs545.springdatai.dto.ReviewDto;
import edu.miu.cs545.springdatai.entity.Review;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReviewUtils {
    @Autowired
    private static ModelMapper mapper;

    public static ReviewDto parseReviewToReviewDto(Review review){
        return mapper.map(review, ReviewDto.class);
    }

    public static Review parseReviewDtoToReview(ReviewDto reviewDto){
        return mapper.map(reviewDto,Review.class);
    }
}
