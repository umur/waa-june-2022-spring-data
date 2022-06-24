package edu.miu.springdata.lab3.services.impl;

<<<<<<< HEAD
import edu.miu.springdata.lab3.dtos.ReviewDto;
import edu.miu.springdata.lab3.dtos.UserDto;
import edu.miu.springdata.lab3.entity.Review;
=======
>>>>>>> origin
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
<<<<<<< HEAD

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

=======
    @Override
    public void save(User p) {
        reviewRepo.save(p);
>>>>>>> origin
    }

    @Override
    public void delete(int id) {
        reviewRepo.deleteById(id);
    }
<<<<<<< HEAD
=======

    @Override
    public User getById(int id) {
        return (User) reviewRepo.findById(id).get();
    }

    @Override
    public List<User> getAll() {
        return StreamSupport.stream(reviewRepo.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }
>>>>>>> origin
}
