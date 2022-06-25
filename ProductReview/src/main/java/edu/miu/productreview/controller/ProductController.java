package edu.miu.productreview.controller;

import edu.miu.productreview.model.Product;
import edu.miu.productreview.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private IProductService productService;

    @GetMapping
    public List<Product> getAllUser(){
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public Optional<Product> getProductById(@PathVariable int id){
        return productService.getProductById(id);
    }

    @PostMapping
    public Product createProduct( @RequestBody Product product){
            return productService.createProduct(product);
    }

    @PutMapping
    public Product updateProduct(@RequestBody  Product product){
        return productService.updateProduct(product);
    }

    @DeleteMapping("/{id}")
    public void deleteByID( @PathVariable int id){
        productService.deleteProductById(id);
    }

}
