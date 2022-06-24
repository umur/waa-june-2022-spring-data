package edu.miu.cs545.springdatai.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    @Embedded
    private Address address;
    @OneToMany(mappedBy = "userId")
    private List<Review> reviews = new ArrayList<>();

    public void addReviews(Review review){
        Review addedReview = new Review();
        addedReview=review;

        reviews.add(addedReview);
    }

}
