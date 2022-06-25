package com.cs545waa.lab03.service;

import com.cs545waa.lab03.dto.CategoryDTO;
import com.cs545waa.lab03.dto.ProductDTO;
import com.cs545waa.lab03.dto.ProductDTO2;

import java.util.List;

public interface ProductService {
    public void create(ProductDTO dto);
    public void update(ProductDTO dto);
    public void delete(int id);
    public ProductDTO read(int id);
    public List<ProductDTO2> readAll();
    public List<ProductDTO> findProductByPriceLessThan(double price);
    public List<ProductDTO> findProductsByCategoryAndPriceLessThan(CategoryDTO name, double price);
    public List<ProductDTO> findProductsByNameContains(String name);
    public List<ProductDTO> findProductsByAppUser(int appUser);
}
