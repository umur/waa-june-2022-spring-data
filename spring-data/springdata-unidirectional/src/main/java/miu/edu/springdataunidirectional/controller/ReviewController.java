package miu.edu.springdataunidirectional.controller;

import miu.edu.springdata.dto.ReviewDto;
import miu.edu.springdata.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reviews")
public class ReviewController {
    @Autowired
    ReviewService reviewService;

    @GetMapping
    public List<ReviewDto> findAll() {
        return reviewService.findAll();
    }

    @PostMapping
    public void create(@RequestBody ReviewDto review) {
        reviewService.create(review);
    }

    @PutMapping("/{id}")
    public ReviewDto update(@RequestBody ReviewDto review, @PathVariable int id) {
        return reviewService.update(review, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        reviewService.delete(id);
    }
}
