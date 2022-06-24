package com.example.hibernate.jointable.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue
    private int Id;
    private String firstName;
    private String lastName;
    private String email;
    @JsonIgnore
    private String password;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable
    List<Review> reviews;

    @OneToOne(cascade = CascadeType.ALL)
    private Address address;

}
