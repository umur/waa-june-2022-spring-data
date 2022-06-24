package com.example.demo.controller;

import com.example.demo.dto.ProductDto;
import com.example.demo.entity.Category;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")

public class ProductController {
  @Autowired
  ProductService productService;

  @GetMapping
  public List<ProductDto> findAllProduct() {

    return productService.findAllProduct();
  }

  @PostMapping
  public void createProduct(@RequestBody ProductDto dto) {
    productService.createProduct(dto);
  }

  @DeleteMapping("/{id}")
  public void deleteProduct(@PathVariable int id) {
    productService.delete(id);
  }

  @PutMapping("/{id}")

  public void update(@RequestBody @PathVariable int id, ProductDto productDto) {

    productService.update(id, productDto);
  }

  @GetMapping("/search")
  List<ProductDto> findAllByNameContains(@RequestParam String checkName) {

    return productService.findAllByNameContains(checkName);
  }

  @GetMapping("/search")
  public List<ProductDto> findAllByCategoryAndPriceBefore(@RequestParam Category category, @RequestParam double checkprice) {

    return productService.findAllByCategoryAndPriceBefore(category, checkprice);
  }

  @GetMapping("/search")
  public List<ProductDto> findAllByPriceAfter(@RequestParam double checkPrice) {

    return productService.findAllByPriceAfter(checkPrice);
  }

}
