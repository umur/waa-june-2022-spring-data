package edu.miu.springdata.service.impl;


import edu.miu.springdata.dto.ProductDto;
import edu.miu.springdata.dto.ReviewDto;
import edu.miu.springdata.entity.Product;
import edu.miu.springdata.entity.Review;
import edu.miu.springdata.repo.CategoryRepo;
import edu.miu.springdata.repo.ProductRepo;
import edu.miu.springdata.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepo productRepo;
    private final ModelMapper modelMapper;

    private final CategoryRepo categoryRepo;

    /*
     * Find all products that cost more than minPrice.
     */
    @Override
    public List<ProductDto> findProductByMinPrice(int minPrice) {
        var dataList = productRepo.findAll();
        List<ProductDto> productDtoList = new ArrayList<>();
        for (Product product : dataList) {
            if (product.getPrice() > minPrice) {
                var rs = modelMapper.map(product, ProductDto.class);
                productDtoList.add(rs);
            }
        }
        return productDtoList;
    }

    /*
     * Find all products in cat category and cost less than maxPrice.
     */
    @Override
    public List<ProductDto> findProductByCatAndPrice(int maxPrice,int id) {
        List<ProductDto> productDtoList = new ArrayList<>();
        var category = categoryRepo.findById(id);
        List<Product> products = category.getProducts();
        for (Product product : products) {
            if (product.getPrice() < maxPrice) {
                var rs = modelMapper.map(product, ProductDto.class);
                productDtoList.add(rs);
            }
        }
        return productDtoList;
    }

    /*
     * Find all products that contain keyword in the name.
     */
    @Override
    public List<ProductDto> findProductByName(String name) {
        var dataList = productRepo.findAll();
        List<ProductDto> productDtoList = new ArrayList<>();
        for (Product product : dataList) {
            if (product.getName().contains(name)) {
                var rs = modelMapper.map(product, ProductDto.class);
                productDtoList.add(rs);
            }
        }
        return productDtoList;
    }

    /*
     * Find all products created by the user with id =id.
     */
    @Override
    public List<ProductDto> findProductByUserId(int userId) {
        var dataList = productRepo.findAll();
        List<ProductDto> productDtoList = new ArrayList<>();
        for (Product product : dataList) {
            if (product.getUser().getId() == userId) {
                var rs = modelMapper.map(product, ProductDto.class);
                productDtoList.add(rs);
            }
        }
        return productDtoList;
    }

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
