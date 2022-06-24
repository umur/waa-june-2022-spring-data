package miu.edu.unimapping.service.impl;

import miu.edu.unimapping.dto.CategoryDto;
import miu.edu.unimapping.dto.ProductDto;
import miu.edu.unimapping.dto.ProductDto;
import miu.edu.unimapping.dto.UserDto;
import miu.edu.unimapping.entity.Category;
import miu.edu.unimapping.entity.Product;
import miu.edu.unimapping.entity.Product;
import miu.edu.unimapping.repository.ProductRepository;
import miu.edu.unimapping.service.ProductService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private ModelMapper mapper;

    @Override
    public List<ProductDto> getAllProduct() {
        List<Product> products = (List<Product>) productRepository.findAll();
        List<ProductDto> productsDto = products.stream()
                .map(st ->toDto(st))
                .collect(Collectors.toList());
        return productsDto;
    }

    @Override
    public Product addProduct(ProductDto productDto) {
        Product product = toEntity(productDto);
        return productRepository.save(product) ;
    }

    @Override
    public void deleteProduct(Integer id) {
        productRepository.deleteById(id);
    }

    @Override
    public Product updateProduct(ProductDto productDto, Integer id) {
        Product product = toEntity(productDto);
        productRepository.findById(id).map(products->{
            products.setName(product.getName());
            products.setPrice(product.getPrice());
            products.setRating(product.getRating());
            return productRepository.save(products);
        });
        return product;
    }

    @Override
    public List<ProductDto> productWithGreaterThanMinPrice(Double price) {
        List<Product> products = productRepository.findAllByPriceAfter(price);
        List<ProductDto> productSDto = products.stream()
                .map(product -> toDto(product))
                .collect(Collectors.toList());
        return productSDto;
    }

//    @Override
//    public List<ProductDto> productWithCategoryAndLessThanMaxPrice(Category category, Double price) {
//        List<Product> products = productRepository.findAllByCategoryAndPriceBefore(category, price);
//        List<ProductDto> productDto = products.stream()
//                .map(product -> toDto(product))
//                .collect(Collectors.toList());
//        return productDto;
//    }

    @Override
    public List<ProductDto> findAllByName(String name) {
        List<Product> products = productRepository.findAllByNameContains(name);
        List<ProductDto> productDto = products.stream()
                .map(product -> toDto(product))
                .collect(Collectors.toList());
        return productDto;
    }

    public ProductDto toDto(Product product){
        ProductDto productDto = mapper.map(product, ProductDto.class);
        return productDto;
    }

    public Product toEntity(ProductDto productDto){
        Product product = mapper.map(productDto, Product.class);
        return product;
    }
}
