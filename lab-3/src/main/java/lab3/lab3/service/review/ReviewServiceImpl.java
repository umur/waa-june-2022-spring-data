package lab3.lab3.service.review;

import lab3.lab3.dto.ReviewDTO;
import lab3.lab3.entity.Review;
import lab3.lab3.entity.entity_bi.Product_bi;
import lab3.lab3.entity.entity_bi.Review_bi;
import lab3.lab3.repository.ReviewRepo;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class ReviewServiceImpl implements ReviewService{

    private final ReviewRepo reviewRepo;
    private final ModelMapper modelMapper;
    @Override
    public List<ReviewDTO> getReview() {
        return reviewRepo.findAll().stream().map(review -> modelMapper.map(review,ReviewDTO.class)).toList();
    }

    @Override
    public void createReview(ReviewDTO reviewDto) {
        reviewRepo.save(modelMapper.map(reviewDto, Review.class));
    }

    @Override
    public void deleteReview(int id) {
    reviewRepo.deleteById(id);
    }

    @Override
    public void updateReview(ReviewDTO reviewDto,int id) {
        Review review=modelMapper.map(reviewDto,Review.class);
        review.setId(id);
        reviewRepo.save(review);
    }

    @Override
    public List<ReviewDTO> getReviewsWithId(int id) {
        return null;
    }
}
