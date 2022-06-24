package edu.miu.cs545.springdatai.service;

import edu.miu.cs545.springdatai.dto.ProductDto;
import edu.miu.cs545.springdatai.dto.ReviewDto;

import java.util.List;

public interface ProductService {
    List<ProductDto> findProductByMinPrice(int minPrice);
    List<ProductDto> findProductByCatAndPrice(int maxPrice,int id);
    List<ProductDto> findProductByName(String name);
    List<ProductDto> findProductByUserId(int userId);
}
