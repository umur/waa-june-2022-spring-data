package edu.miu.springdata.lab3.services;

import com.pprajapati.springdata1.domain.*;
import edu.miu.springdata.lab3.domain.Product;
import edu.miu.springdata.lab3.domain.Review;

import java.util.List;

public interface ProductService {
    void save(Product p);

    void delete(int id);

    Product getById(int id);

    List<Product> getAll();

    List<Product> getWithMinPrice();
    List<Review> getReviewsFromProductId(int productId);

    List<Product> getByName(String name);
}
