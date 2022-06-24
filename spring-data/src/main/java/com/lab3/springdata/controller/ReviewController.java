package com.lab3.springdata.controller;

import com.lab3.springdata.dto.ReviewDto;
import com.lab3.springdata.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/review")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    @GetMapping
    public List<ReviewDto> findAll() {return reviewService.findAll();}

    @GetMapping("/{id}")
    public ReviewDto findById(@PathVariable int id) {return reviewService.findById(id);}

    @PostMapping
    public ReviewDto create(@RequestBody ReviewDto reviewDto) {return reviewService.create(reviewDto);}

    @DeleteMapping
    public void delete(@PathVariable int id) {reviewService.delete(id);}
}
