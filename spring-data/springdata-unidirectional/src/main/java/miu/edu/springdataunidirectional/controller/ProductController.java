package miu.edu.springdataunidirectional.controller;

import miu.edu.springdata.dto.ProductDto;
import miu.edu.springdata.service.ProductService;
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

//    @GetMapping("/findAllByPrice")
}
