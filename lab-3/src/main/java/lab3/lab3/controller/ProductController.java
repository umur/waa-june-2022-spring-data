package lab3.lab3.controller;

import lab3.lab3.dto.ProductDTO;
import lab3.lab3.service.user.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
@AllArgsConstructor
public class ProductController {

    private final ProductService productService;
    @GetMapping
    public List<ProductDTO> getProducts(){
        return productService.getProducts();
    }
}
