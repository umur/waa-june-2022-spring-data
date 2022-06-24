package edu.miu.springdata.service.impl;

import edu.miu.springdata.dto.ReviewDto;
import edu.miu.springdata.entity.Review;
import edu.miu.springdata.repo.ReviewRepo;
import edu.miu.springdata.service.ReviewService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class ReviewServiceImpl implements ReviewService {

    private ReviewRepo reviewRepo;

    private ModelMapper mapper;

    @Override
    public void save(ReviewDto reviewDto) {
        reviewRepo.save(dtoToEntity(reviewDto));
    }

    @Override
    public void updateReview(ReviewDto reviewDto, Integer id){
        Review review = getById(id);
        review.setComment(reviewDto.getComment());

        reviewRepo.save(review);
    }

    @Override
    public void delete(int id) {
        reviewRepo.deleteById(id);
    }

    @Override
    public Review getById(int id) {
        return reviewRepo.findById(id).get();
    }

    @Override
    public List<ReviewDto> getAll() {
        var reviews = reviewRepo.findAll();
        var result = new ArrayList<ReviewDto>();

        for(Review review: reviews){
            ReviewDto dto = new ReviewDto();
            var reviewDto = toDto(review);
            result.add(reviewDto);
        }
        return result;
    }

    private ReviewDto toDto(Review review){
        ReviewDto dto = mapper.map(review, ReviewDto.class);
        return dto;
    }
    public Review dtoToEntity(ReviewDto reviewDto){
        Review review = mapper.map(reviewDto, Review.class);
        return review;
    }
}
