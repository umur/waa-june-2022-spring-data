package edu.miu.cs545.joincolumn.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name="users")
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
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn
    private List<Review> reviews;

    public void addReviews(Review review){
        reviews.add(review);
    }
}
