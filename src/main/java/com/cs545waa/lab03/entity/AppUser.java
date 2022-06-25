package com.cs545waa.lab03.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;


    @JsonManagedReference
    @OneToOne(mappedBy = "appUser", fetch = FetchType.LAZY)
    private Address address;


    @JsonManagedReference
    @OneToMany(mappedBy = "appUser", fetch = FetchType.LAZY)
    private List<Review> reviews;

    @JsonManagedReference
    @OneToMany(mappedBy = "appUser", fetch = FetchType.LAZY)
    private List<Product> products;
}
