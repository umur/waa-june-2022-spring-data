package lab3.controller;

import lab3.DTO.ProductDto;
import lab3.model.bidirectional.Category;
import lab3.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class ProductController {
    public final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    @GetMapping("")
    public ResponseEntity<?> getAll(){
        return new ResponseEntity(productService.getAll(), HttpStatus.OK);
    }
    @GetMapping("/price/{price}")
 public List<ProductDto> getproGreaterMinPrice(@PathVariable double price){
        return productService.getproGreaterMinPrice(price);
 }
@GetMapping("/category/{price}")
    public List<ProductDto> getCatLessMinprice(@PathVariable Category cat,@PathVariable double price){
        return productService.getCatLessMinprice(cat,price);
}
@GetMapping("/product/{id}")
    public ResponseEntity<?> getAllById(@PathVariable int id){
        return new ResponseEntity(productService.getAllById(id),HttpStatus.OK);
}
}
