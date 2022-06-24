package edu.miu.springdata.lab3.services.impl;

import edu.miu.springdata.lab3.dtos.ReviewDto;
import edu.miu.springdata.lab3.dtos.UserDto;
import edu.miu.springdata.lab3.entity.Review;
import edu.miu.springdata.lab3.entity.User;
import edu.miu.springdata.lab3.repositories.ReviewRepo;
import edu.miu.springdata.lab3.services.ReviewService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
@AllArgsConstructor
public class ReviewServiceImpl implements ReviewService {

    @Autowired
    private final ReviewRepo reviewRepo;

    @Autowired
    private final ModelMapper modelMapper;

    @Override
    public List<ReviewDto> getAll() {
        return StreamSupport.stream(reviewRepo.findAll().spliterator(), false)
                .map(u -> modelMapper.map(u, ReviewDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public void update(ReviewDto reviewDto, int id) {
        return;
    }

    @Override
    public void create(ReviewDto reviewDto) {
        reviewRepo.save(modelMapper.map(reviewDto, Review.class));

    }

    @Override
    public void delete(int id) {
        reviewRepo.deleteById(id);
    }
}
