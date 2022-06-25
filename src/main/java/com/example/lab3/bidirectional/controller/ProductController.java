package com.example.lab3.bidirectional.controller;

import com.example.lab3.bidirectional.dto.ProductDTO;
import com.example.lab3.bidirectional.entity.Product;
import com.example.lab3.bidirectional.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/save")
    public void createProduct(@RequestBody Product product) {
        productService.save(product);
    }

    @GetMapping("/get")
    public List<ProductDTO> getAll() {
        return productService.getAll();
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable int id) {
        var product = productService.findById(id);
        return ResponseEntity.ok(product);
    }

    @GetMapping("/get/item")
    public List<ProductDTO> getProductsMoreThanMinPrice(@RequestParam String price) {
        return productService.getProductByPriceGreaterThan(Double.parseDouble(price));
    }

    @GetMapping("/get/item")
    public List<ProductDTO> getProductsByPriceLessThanAndCategory_Name(@RequestParam String price, @RequestParam String category) {
        return productService.getProductsByPriceLessThanAndCategory_Name(Double.parseDouble(price),category);
    }

    @GetMapping("/get/item")
    public List<ProductDTO> getProductsByNameContains(@RequestParam String name){
        return productService.getProductsByNameContains(name);
    }

    @GetMapping("/get/item")
    public List<ProductDTO> getProductsByUserId(@RequestParam String userId){
        return productService.getProductsByUserId(Integer.parseInt(userId));
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id) {
        productService.delete(id);
    }



}
