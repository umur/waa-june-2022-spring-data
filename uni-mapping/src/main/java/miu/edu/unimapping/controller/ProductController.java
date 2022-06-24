package miu.edu.unimapping.controller;
import miu.edu.unimapping.dto.ProductDto;
import miu.edu.unimapping.entity.Category;
import miu.edu.unimapping.entity.Product;
import miu.edu.unimapping.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping
    public Collection<ProductDto> findAll(){
        return productService.getAllProduct();
    }
    @PostMapping
    public Product addProduct(@RequestBody ProductDto productDto){
        return productService.addProduct(productDto);
    }

    @PutMapping("/{id}")
    public Product Update(@RequestBody ProductDto productDto, @PathVariable Integer id){
        return productService.updateProduct(productDto, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        productService.deleteProduct(id);
    }

    @GetMapping("/search/priceMoreThan")
    public List<ProductDto> findAllByPriceAfter(@RequestParam(name = "price") Double checkPrice){
        return productService.productWithGreaterThanMinPrice(checkPrice);
    }

//    @GetMapping("/searchByCategoryAndPrice")
//    public List<ProductDto> findAllByCategoryAndPriceLessThan(@RequestParam Category category, @RequestParam Double price){
//        return productService.productWithCategoryAndLessThanMaxPrice(category, price);
//    }

    @GetMapping("/searchByNameContains")
    public List<ProductDto> findByNameContains(@RequestParam String name){
        return productService.findAllByName(name);
    }
}
