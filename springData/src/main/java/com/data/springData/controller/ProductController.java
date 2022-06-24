package com.data.springData.controller;

import com.data.springData.dto.CategoryDto;
import com.data.springData.dto.ProductDto;
import com.data.springData.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Products")
public class ProductController {
    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping()
    public ProductDto save(@RequestBody ProductDto productDto) {
        return productService.save(productDto);
    }

    @GetMapping()
    public List<ProductDto> getAll() {
        return productService.getProducts();
    }

    @PutMapping("/{id}")
    public ProductDto update(@PathVariable int id, @RequestBody ProductDto productDto) {
        return productService.edit(id, productDto);
    }

    @DeleteMapping("/{id}")
    public ProductDto delete(@PathVariable int id) {
        return productService.delete(id);
    }
}
