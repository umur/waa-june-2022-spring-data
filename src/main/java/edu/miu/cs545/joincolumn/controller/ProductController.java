package edu.miu.cs545.joincolumn.controller;

import edu.miu.cs545.joincolumn.dto.ProductDto;
import edu.miu.cs545.joincolumn.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/product")
public class ProductController {
    private final ProductService productService;

    @PostMapping
    public ProductDto createProduct(@RequestBody ProductDto productDto){
        return productService.createProduct(productDto);
    }

    @GetMapping
    public List<ProductDto> getAllProducts(){
        return productService.getAllProducts();
    }

    @PutMapping("/{id}")
    public ProductDto updateProduct(@PathVariable int id, @RequestBody ProductDto productDto){
        return productService.updateProduct(id,productDto);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable int id){
        productService.deleteProduct(id);
    }

    @GetMapping("/findProductByMinPrice/{minPrice}")
    public List<ProductDto> findProductByMinPrice(@PathVariable int minPrice){
        return productService.findProductByMinPrice(minPrice);
    }

    @GetMapping(value = "/findProductByCatAndPrice")
    public List<ProductDto> findProductByCatAndPrice(@RequestParam int maxPrice, int id){
        return productService.findProductByCatAndPrice(maxPrice,id);
    }

    @GetMapping("/findProductByName/{name}")
    public List<ProductDto> findProductByName(@PathVariable String name){
        return productService.findProductByName(name);
    }

    @GetMapping("/findProductByUserId/{userId}")
    public List<ProductDto> findProductByUserId(@PathVariable int userId){
        return productService.findProductByUserId(userId);
    }
}
