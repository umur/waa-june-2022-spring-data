package edu.miu.springdata.service.impl;


import edu.miu.springdata.dto.ProductDto;
import edu.miu.springdata.dto.ReviewDto;
import edu.miu.springdata.entity.Product;
import edu.miu.springdata.entity.Review;
import edu.miu.springdata.repo.CategoryRepo;
import edu.miu.springdata.repo.ProductRepo;
import edu.miu.springdata.service.ProductService;
import edu.miu.springdata.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ReviewServiceImpl implements ReviewService {

    private final ProductRepo productRepo;
    private final ModelMapper modelMapper;

    /*
     * Find reviews of the product whose id is id.
     */
    @Override
    public List<ReviewDto> findReviewByProductId(int productId) {
        var product = productRepo.findById(productId);
        List<ReviewDto> reviewDtoList = new ArrayList<>();
        for (Review review : product.getReviews()) {
            var rs = modelMapper.map(review, ReviewDto.class);
            reviewDtoList.add(rs);
        }
        return reviewDtoList;
    }
}
