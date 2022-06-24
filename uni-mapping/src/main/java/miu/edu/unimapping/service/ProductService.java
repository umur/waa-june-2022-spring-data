package miu.edu.unimapping.service;
import miu.edu.unimapping.dto.CategoryDto;
import miu.edu.unimapping.dto.ProductDto;

import miu.edu.unimapping.entity.Category;
import miu.edu.unimapping.entity.Product;

import java.util.Collection;
import java.util.List;

public interface ProductService {
    public List<ProductDto> getAllProduct();

    public Product addProduct(ProductDto productDto);

    public void deleteProduct(Integer id);

    public Product updateProduct(ProductDto productDto, Integer id);

    public List<ProductDto> productWithGreaterThanMinPrice(Double price);

//    public List<ProductDto> productWithCategoryAndLessThanMaxPrice(Category category, Double price);

    public List<ProductDto> findAllByName(String name);
}
