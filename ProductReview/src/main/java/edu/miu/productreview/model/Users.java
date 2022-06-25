package edu.miu.productreview.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;

    @OneToMany
    @JoinColumn(name = "user_id")
    private List<Review> reviews;
//
//    // Join Table
//    @OneToMany
//    @JoinTable
//    private List<Review> reviews;

    @OneToOne(mappedBy = "users")
    private Address address;
}
