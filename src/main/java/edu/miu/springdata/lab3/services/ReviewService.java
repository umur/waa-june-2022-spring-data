package edu.miu.springdata.lab3.services;

import edu.miu.springdata.lab3.dtos.ReviewDto;
import edu.miu.springdata.lab3.dtos.UserDto;
import edu.miu.springdata.lab3.entity.User;

import java.util.List;

public interface ReviewService {

    List<ReviewDto> getAll();

    ReviewDto update(ReviewDto reviewDto, int id);

    void delete(int id);
    void save(ReviewDto p);

    ReviewDto getById(int id);
}
