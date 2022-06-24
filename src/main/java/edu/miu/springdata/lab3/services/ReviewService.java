package edu.miu.springdata.lab3.services;

import edu.miu.springdata.lab3.dtos.ReviewDto;

import java.util.List;

public interface ReviewService {

    List<ReviewDto> getAll();

    void update(ReviewDto reviewDto, int id);

    void create(ReviewDto reviewDto);

    void delete(int id);
}
