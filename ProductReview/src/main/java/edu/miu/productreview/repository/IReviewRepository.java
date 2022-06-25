package edu.miu.productreview.repository;

import edu.miu.productreview.model.Review;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IReviewRepository extends CrudRepository<Review, Integer> {
}
