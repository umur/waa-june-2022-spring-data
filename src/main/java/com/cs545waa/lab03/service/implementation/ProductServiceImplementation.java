package com.cs545waa.lab03.service.implementation;

import com.cs545waa.lab03.dto.AppUserDTO;
import com.cs545waa.lab03.dto.CategoryDTO;
import com.cs545waa.lab03.dto.ProductDTO;
import com.cs545waa.lab03.dto.ProductDTO2;
import com.cs545waa.lab03.entity.AppUser;
import com.cs545waa.lab03.entity.Category;
import com.cs545waa.lab03.entity.Product;
import com.cs545waa.lab03.repo.ProductRepo;
import com.cs545waa.lab03.service.ProductService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
@AllArgsConstructor
@Data
public class ProductServiceImplementation implements ProductService {
    private final ProductRepo repository;
    private final ModelMapper mapper;
    @Override
    public void create(ProductDTO dto) {
        repository.save(mapper.map(dto, Product.class));
    }

    @Override
    public void update(ProductDTO dto) {
        repository.save(mapper.map(dto, Product.class));
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }

    @Override
    public ProductDTO read(int id) {
        return  mapper.map(repository.findById(id).get(),ProductDTO.class);
    }

    @Override
    public List<ProductDTO2> readAll() {
        List<ProductDTO2> products=new ArrayList<>();
        repository.findAll().forEach(product -> products.add( mapper.map(product,ProductDTO2.class)));
        return products;
    }

    @Override
    public List<ProductDTO> findProductByPriceLessThan(double price) {
        return repository.findProductByPriceLessThan(price)
                .stream()
                .map(product -> mapper.map(product,ProductDTO.class))
                .toList();
    }
    @Override
    public List<ProductDTO> findProductsByCategoryAndPriceLessThan(CategoryDTO dto, double price){

        return repository.findProductsByCategoryAndPriceLessThan(mapper.map(dto, Category.class),price)
                .stream()
                .map(product -> mapper.map(product,ProductDTO.class))
                .toList();
    }
    @Override
    public List<ProductDTO> findProductsByNameContains(String name) {
        return repository.findProductsByNameContains(name)
                .stream()
                .map(product -> mapper.map(product,ProductDTO.class))
                .toList();
    }
    @Override
    public List<ProductDTO> findProductsByAppUser(int appUser) {
        AppUserDTO dto=new AppUserDTO();
        dto.setId(appUser);
        return repository.findProductsByAppUser(mapper.map(dto, AppUser.class))
                .stream()
                .map(product -> mapper.map(product,ProductDTO.class))
                .toList();
    }
}
