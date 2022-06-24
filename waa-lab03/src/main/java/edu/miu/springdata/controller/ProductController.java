package edu.miu.springdata.controller;

import edu.miu.springdata.dto.ProductDto;
import edu.miu.springdata.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/products")
@CrossOrigin
public class ProductController {

    private final ProductService productService;

    //http://localhost:8080/products/findProductByMinPrice/10
    @GetMapping("/findProductByMinPrice/{minPrice}")
    public List<ProductDto> findProductByMinPrice(@PathVariable int minPrice){
        return productService.findProductByMinPrice(minPrice);
    }

    //http://localhost:8080/products/findProductByCatAndPrice?maxPrice=300&id=1
    @GetMapping(value = "/findProductByCatAndPrice")
    public List<ProductDto> findProductByCatAndPrice(@RequestParam int maxPrice,int id){
        return productService.findProductByCatAndPrice(maxPrice,id);
    }

    //http://localhost:8080/products/findProductByName/cat
    @GetMapping("/findProductByName/{name}")
    public List<ProductDto> findProductByMinPrice(@PathVariable String name){
        return productService.findProductByName(name);
    }

    //http://localhost:8080/products/findProductByUserId/1
    @GetMapping("/findProductByUserId/{userId}")
    public List<ProductDto> findProductByUserId(@PathVariable int userId){
        return productService.findProductByUserId(userId);
    }
}
