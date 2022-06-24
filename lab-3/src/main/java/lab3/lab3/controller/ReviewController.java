package lab3.lab3.controller;

import lab3.lab3.dto.ProductDTO;
import lab3.lab3.dto.ReviewDTO;
import lab3.lab3.entity.Review;
import lab3.lab3.repository.ReviewRepo;
import lab3.lab3.service.review.ReviewService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping
public class ReviewController {

    private final ReviewService reviewService;
    @GetMapping
    public List<ReviewDTO> getProducts() {
        return reviewService.getReview();
    }

    @PostMapping
    public void save(@RequestBody ReviewDTO reviewDTO) {
        reviewService.createReview(reviewDTO);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        reviewService.deleteReview(id);
    }

    @PutMapping("/{id}")
    public void update(@RequestBody ReviewDTO reviewDTO, @PathVariable int id) {
        reviewService.updateReview(reviewDTO, id);
    }
}