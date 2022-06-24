package edu.miu.springdata.lab3.controllers;

import edu.miu.springdata.lab3.dtos.CategoryDto;
import edu.miu.springdata.lab3.dtos.ProductDto;
import edu.miu.springdata.lab3.dtos.ReviewDto;
import edu.miu.springdata.lab3.entity.Product;
import edu.miu.springdata.lab3.entity.Review;
import edu.miu.springdata.lab3.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/products")
public class ProductController {
    private final ProductService productService;

    @PostMapping
    public void save(@RequestBody ProductDto productDto) {
        productService.save(productDto);
    }

    @GetMapping
    public List<ProductDto> getAll() {
        return productService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductDto> getById(@PathVariable int id) {
        var product = productService.getById(id);
        return ResponseEntity.ok(product);
    }

    @PostMapping("/{id}")
    public ResponseEntity<ProductDto> update(@PathVariable int id, @RequestBody ProductDto productDto) {
        var product = productService.update(productDto, id);
        return ResponseEntity.ok(product);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        productService.delete(id);
    }

    @GetMapping("/{id}/reviews")
    public List<ReviewDto> getReviewsByProductId(@PathVariable int id) {
        return productService.getReviewsFromProductId(id);

    }
}
