package lab3.lab3.service.review;

import lab3.lab3.dto.ReviewDTO;

import java.util.List;

public interface ReviewService {
    public List<ReviewDTO> getReview();
    public void createReview(ReviewDTO reviewDto);
    public void deleteReview(int id);
    public void updateReview(ReviewDTO reviewDto, int id);
    public List<ReviewDTO> getReviewsWithId(int id);
}
