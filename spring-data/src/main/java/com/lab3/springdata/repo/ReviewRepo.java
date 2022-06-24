package com.lab3.springdata.repo;

import com.lab3.springdata.model.Review;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepo extends CrudRepository<Review, Integer> {
}
