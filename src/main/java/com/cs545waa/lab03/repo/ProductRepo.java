package com.cs545waa.lab03.repo;

import com.cs545waa.lab03.entity.AppUser;
import com.cs545waa.lab03.entity.Category;
import com.cs545waa.lab03.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends CrudRepository<Product,Integer> {

    public List<Product> findProductByPriceLessThan(double price);
    public List<Product> findProductsByCategoryAndPriceLessThan(Category name, double price);
    public List<Product> findProductsByNameContains(String name);
    public List<Product> findProductsByAppUser(AppUser appUser);
}
