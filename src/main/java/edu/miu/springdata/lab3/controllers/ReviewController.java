package edu.miu.springdata.lab3.controllers;

import edu.miu.springdata.lab3.dtos.ReviewDto;
import edu.miu.springdata.lab3.dtos.UserDto;
import edu.miu.springdata.lab3.services.ReviewService;
import edu.miu.springdata.lab3.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/reviews")
public class ReviewController {
    private final ReviewService reviewService;

    @PostMapping
    public void save(@RequestBody ReviewDto reviewDto) {
        reviewService.save(reviewDto);
    }

    @GetMapping
    public List<ReviewDto> getAll() {
        return reviewService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ReviewDto> getById(@PathVariable int id) {
        var review = reviewService.getById(id);
        return ResponseEntity.ok(review);
    }

    @PostMapping("/{id}")
    public ResponseEntity<ReviewDto> update(@PathVariable int id, @RequestBody ReviewDto reviewDto) {
        var review = reviewService.update( reviewDto, id);
        return ResponseEntity.ok(review);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        reviewService.delete(id);
    }
}