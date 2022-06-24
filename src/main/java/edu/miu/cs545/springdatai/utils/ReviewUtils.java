package edu.miu.cs545.springdatai.utils;

import edu.miu.cs545.springdatai.dto.ReviewDto;
import edu.miu.cs545.springdatai.entity.Review;
import org.modelmapper.ModelMapper;

public class ReviewUtils {
    private static final ModelMapper mapper = new ModelMapper();

    public static ReviewDto parseReviewToReviewDto(Review review){
        return mapper.map(review, ReviewDto.class);
    }

    public static Review parseReviewDtoToReview(ReviewDto reviewDto){
        return mapper.map(reviewDto,Review.class);
    }
}
