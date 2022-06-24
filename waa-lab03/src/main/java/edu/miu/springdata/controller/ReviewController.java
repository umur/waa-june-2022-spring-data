package edu.miu.springdata.controller;

import edu.miu.springdata.dto.ProductDto;
import edu.miu.springdata.dto.ReviewDto;
import edu.miu.springdata.service.ProductService;
import edu.miu.springdata.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/reviews")
@CrossOrigin
public class ReviewController {

    private final ReviewService reviewService;

    //http://localhost:8080/reviews/findReviewByProductId/1
    @GetMapping("/findReviewByProductId/{productId}")
    public List<ReviewDto> findReviewByProductId(@PathVariable int productId){
        return reviewService.findReviewByProductId(productId);
    }
}
