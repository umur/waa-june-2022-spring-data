package miu.edu.springdataunidirectional.controller;

import miu.edu.springdataunidirectional.dto.CategoryDto;
import miu.edu.springdataunidirectional.dto.ProductDto;
import miu.edu.springdataunidirectional.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping
    public List<ProductDto> findAll() {
        return productService.findAll();
    }

    @PostMapping
    public void create(@RequestBody ProductDto product) {
        productService.create(product);
    }

    @PutMapping("/{id}")
    public ProductDto update(@RequestBody ProductDto product, @PathVariable int id) {
        return productService.update(product, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        productService.delete(id);
    }

    @GetMapping("/costMoreThan")
    public List<ProductDto> findByMinPrice(@RequestParam double price) {
        return productService.findAllByMinPrice(price);
    }

//    @GetMapping("/findAllCategoriesAndPrice")
//    public List<ProductDto> findAllCategoriesNPrice(@RequestParam CategoryDto categoryDto, @RequestParam double price) {
//        return productService.findAllByCategoryAndPrice(categoryDto, price);
//    }

    @GetMapping("/findByName")
    public List<ProductDto> findAllByName(@RequestParam String name) {
        return productService.findAllByNameContains(name);
    }
}
