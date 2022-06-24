package com.example.hibernate.association.controller;

import com.example.hibernate.association.dto.ProductDto;
import com.example.hibernate.association.entity.Product;
import com.example.hibernate.association.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("")
    public List<Product> findAllUsers(){
        return productService.findAll();
    }

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable int id) {
        return productService.findById(id);
    }

    @GetMapping("/filter")
    public List<Product> getByPriceGreaterThan(@RequestParam(name = "price") int price){
        return productService.findAllByPriceGreaterThan((double) price);
    }

    @PostMapping("")
    public Product addProduct(@RequestBody ProductDto productDto){
        return productService.addProduct(productDto);
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable int id) {
        productService.deleteById(id);
        return "Deleted";
    }

    @PutMapping("")
    public Product updateUser(@RequestBody Product product){
        return productService.updateProduct(product);
    }

}
