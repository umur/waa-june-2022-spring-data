package lab3.lab3.controller;

import lab3.lab3.dto.ProductDTO;
import lab3.lab3.entity.entity_bi.Category_bi;
import lab3.lab3.service.product.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@AllArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping
    public List<ProductDTO> getProducts() {
        return productService.getProducts();
    }

    @PostMapping
    public void save(@RequestBody ProductDTO userDTO) {
        productService.create(userDTO);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        productService.delete(id);
    }

    @PutMapping("/{id}")
    public void update(@RequestBody ProductDTO userDTO, @PathVariable int id) {
        productService.update(userDTO, id);
    }

    @GetMapping("/byKeyWord/{word}")
    public List<ProductDTO> getProductByName(@PathVariable String word) {
        return productService.getProductContainingKeyWord(word);
    }

    @PostMapping("/categoryAndCost")
    public List<ProductDTO> getByCategoryAndCost(@RequestBody Category_bi categoryBi, double cost) {
        return productService.getProductByCategoryCostLessThan(categoryBi, cost);
    }

    @GetMapping("/costMorethan/{price}")
    public List<ProductDTO> getProductCostingMoreThan(@PathVariable double price) {
        return productService.getProductCostMoreThan(price);
    }
}
