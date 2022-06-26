package edu.miu.springdata.controller;

import edu.miu.springdata.dto.ReviewDto;
import edu.miu.springdata.entity.Review;
import edu.miu.springdata.service.ReviewService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ReviewController {
    private final ReviewService reviewService;

    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @PostMapping("/reviews/")
    public void save(@RequestBody ReviewDto p) {
        reviewService.save(p);
    }

    @GetMapping("/reviews/")
    public List<ReviewDto> getAll() {
        return reviewService.getAll();
    }

    @GetMapping("/reviews/{id}")
    public Review getById(@PathVariable int id) {
        return reviewService.getById(id);
    }

    @DeleteMapping("/reviews/{id}")
    public void delete(@PathVariable int id) {
        reviewService.delete(id);
    }

    @PutMapping("/reviews/{id}")
    public void update(@PathVariable("id") int id, @RequestBody ReviewDto review) {
        reviewService.updateReview(review, id);
    }
}
