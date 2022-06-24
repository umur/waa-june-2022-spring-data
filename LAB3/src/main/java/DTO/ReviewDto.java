package DTO;

import Domain.Review;
import Domain.User;
import lombok.Data;

import javax.persistence.ManyToOne;
@Data
public class ReviewDto {
    private int id;
    private String comment;
    private User user;


//    public ReviewDto toDto(Review review){
//        ReviewDto rdto= new ReviewDto();
//        rdto.setId(review.getId());
//        rdto.setComment(review.getComment());
//        rdto.setUser(review.getUser());
//        return rdto ;
//       }
       public Review toEntity(ReviewDto revdto){
        Review rev= new Review();
        rev.setId(revdto.getId());
        rev.setComment(revdto.getComment());
        rev.setUser(revdto.getUser());
        return rev;
       }
}
