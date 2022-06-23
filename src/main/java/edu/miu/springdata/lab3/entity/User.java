package edu.miu.springdata.lab3.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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

    @OneToMany
    private List<Review> reviews;

    @OneToOne
    private Address address;
}
