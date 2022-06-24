package com.example.hibernate.joincolumn.controller;

import com.example.hibernate.joincolumn.dto.ProductDto;
import com.example.hibernate.joincolumn.entity.Product;
import com.example.hibernate.joincolumn.service.ProductService;
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
