package com.example.datai.controller;

import com.example.datai.dto.ProductDto;
import com.example.datai.entity.Product;
import com.example.datai.service.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductServiceImpl productService;

    public List<ProductDto> findAllCategories(){
        return productService.findAllCategories();
    }
    @GetMapping("/{minPrice}")
    public List<ProductDto> findAllProductGreaterMinPrice(@RequestParam double minPrice) {
        return productService.finalAllProductGreaterMinPrice(minPrice);
    }

    @GetMapping(path = "/{keyword}")
    public List<ProductDto> findByKeyWord(@PathVariable String keyWord) {
        return productService.findByKeyWord(keyWord);
    }
}
