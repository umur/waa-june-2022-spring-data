package com.cs545waa.lab03.repo;

import com.cs545waa.lab03.entity.Product;
import com.cs545waa.lab03.entity.Review;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepo extends CrudRepository<Review,Integer> {
    //public List<Review> findReviewsBy
    public List<Review> findReviewsByProduct(Product product);
}
