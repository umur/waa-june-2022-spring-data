package miu.edu.springdataunidirectional.repo;

import miu.edu.springdataunidirectional.model.Review;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepo extends CrudRepository<Review, Integer> {
}
