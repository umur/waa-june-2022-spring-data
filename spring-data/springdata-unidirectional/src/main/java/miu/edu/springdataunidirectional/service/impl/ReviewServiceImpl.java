package miu.edu.springdataunidirectional.service.impl;

import miu.edu.springdataunidirectional.dto.ReviewDto;
import miu.edu.springdataunidirectional.model.Review;
import miu.edu.springdataunidirectional.repo.ReviewRepo;
import miu.edu.springdataunidirectional.service.ReviewService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ReviewServiceImpl implements ReviewService {
    @Autowired
    ReviewRepo reviewRepo;
    @Autowired
    ModelMapper modelMapper;

    @Override
    public List<ReviewDto> findAll() {
        List<Review> reviews = (List<Review>) reviewRepo.findAll();
        return reviews.stream().map(review-> modelMapper.map(review, ReviewDto.class)).collect(Collectors.toList());
    }

    @Override
    public void create(ReviewDto review) {
        reviewRepo.save(modelMapper.map(review, Review.class));
        System.out.println("New review added successfully");
    }

    @Override
    public ReviewDto update(ReviewDto review, int id) {
        Review add = modelMapper.map(review, Review.class);
        reviewRepo.findById(id).map(ad -> {
            return reviewRepo.save(add);
        });

        return review;
    }

    @Override
    public void delete(int id) {
        reviewRepo.deleteById(id);
    }
}
