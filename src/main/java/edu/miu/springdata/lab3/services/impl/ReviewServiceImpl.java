package edu.miu.springdata.lab3.services.impl;

import edu.miu.springdata.lab3.dtos.ReviewDto;
import edu.miu.springdata.lab3.dtos.UserDto;
import edu.miu.springdata.lab3.entity.Review;
import edu.miu.springdata.lab3.entity.User;
import edu.miu.springdata.lab3.repositories.ReviewRepo;
import edu.miu.springdata.lab3.repositories.UserRepo;
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
    public ReviewDto update(ReviewDto reviewDto, int id) {
        return new ReviewDto();
    }

    @Override
    public void save(ReviewDto p) {
        reviewRepo.save(modelMapper.map(p, Review.class));

    }

    @Override
    public void delete(int id) {
        reviewRepo.deleteById(id);
    }


    @Override
    public ReviewDto getById(int id) {
        return modelMapper.map(reviewRepo.findById(id).get(), ReviewDto.class);
    }

}
