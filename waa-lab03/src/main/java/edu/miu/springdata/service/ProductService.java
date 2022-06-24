package edu.miu.springdata.service;

import edu.miu.springdata.dto.ProductDto;
import edu.miu.springdata.dto.ReviewDto;

import java.util.List;

public interface ProductService {

    List<ProductDto> findProductByMinPrice(int minPrice);
    List<ProductDto> findProductByCatAndPrice(int maxPrice,int id);
    List<ProductDto> findProductByName(String name);
    List<ProductDto> findProductByUserId(int userId);
    List<ReviewDto> findReviewByProductId(int productId);

}
