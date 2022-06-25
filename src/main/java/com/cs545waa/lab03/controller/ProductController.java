package com.cs545waa.lab03.controller;

import com.cs545waa.lab03.dto.CategoryDTO;
import com.cs545waa.lab03.dto.ProductDTO;
import com.cs545waa.lab03.dto.ProductDTO2;
import com.cs545waa.lab03.service.implementation.ProductServiceImplementation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/products")
@AllArgsConstructor
public class ProductController {
    private final ProductServiceImplementation service;
    @GetMapping
    public List<ProductDTO2> readAll(){
       return service.readAll();
    }
    @GetMapping("/filterByProduct")
    public List<ProductDTO> read(@RequestParam String name){
        return service.findProductsByNameContains(name);
    }
    @GetMapping("/filterByPrice")
    public List<ProductDTO> read(@RequestParam double price){
       return service.findProductByPriceLessThan(price);
    }
    @GetMapping("/filterByCatePrice")
    public List<ProductDTO> readByCateAndPrice(@RequestParam int category, @RequestParam double price){
        CategoryDTO dto=new CategoryDTO();
        dto.setId(category);
        return service.findProductsByCategoryAndPriceLessThan(dto,price);
    }
    @GetMapping("/filterByAppUser")
    public List<ProductDTO> readByCateAndPrice(@RequestParam int appUser){
        return service.findProductsByAppUser(appUser);
    }
    @PostMapping
    public void create(@RequestBody ProductDTO dto){
        service.create(dto);
    }
    @PatchMapping
    public void update(@RequestBody ProductDTO dto){
        service.update(dto);
    }
    @DeleteMapping
    public void delete(@RequestParam int id){
        service.delete(id);
    }
}
