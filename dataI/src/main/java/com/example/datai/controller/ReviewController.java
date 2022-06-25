package com.example.datai.controller;

import com.example.datai.dto.ReviewDto;
import com.example.datai.service.impl.ReviewServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/reviews")
public class ReviewController {

    @Autowired
    private ReviewServiceImpl reviewService;

    @GetMapping
    public List<ReviewDto> findAllReviews(){
        return reviewService.fiindAllReviews();
    }

    @GetMapping(path = "/{id}")
    public List<ReviewDto> findAllReviewOfProduct(@PathVariable long id) {
        return reviewService.findAllReviewOfProduct(id);
    }
}
