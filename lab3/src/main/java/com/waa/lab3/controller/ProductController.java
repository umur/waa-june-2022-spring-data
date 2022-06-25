package com.waa.lab3.controller;

import com.waa.lab3.entity.Product;
import com.waa.lab3.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping("/search")
    public List<Product> findProductByPriceGreaterThan(@RequestParam Map<String, String> req) {

        if (req.containsKey("minPrice"))
            return productService.findProductByPriceGreaterThan(Double.valueOf(req.get("minPrice")));

        if (req.containsKey("maxPrice") && req.containsKey("categoryName"))
            return productService.findProductByPriceLessThanAndCategoryName(Double.valueOf(req.get("maxPrice")),
                    req.get("categoryName"));

        if (req.containsKey("keyword"))
            return productService.findProductByNameContaining(req.get("keyword"));

        if (req.containsKey("userId"))
            return productService.findProductByUserId(Long.valueOf(req.get("userid")));

        return new ArrayList<>();
    }

}
