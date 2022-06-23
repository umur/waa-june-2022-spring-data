package edu.miu.springdata.lab3.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private int id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;

    private List<Review> reviews;

    private Address address;
}
