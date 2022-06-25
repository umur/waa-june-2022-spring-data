package com.example.lab3.bidirectional.repository;

import com.example.lab3.bidirectional.entity.Review;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepository extends CrudRepository<Review, Integer> {
    List<Review> findAll();
    List<Review> getReviewsByProductId(int id);
}
