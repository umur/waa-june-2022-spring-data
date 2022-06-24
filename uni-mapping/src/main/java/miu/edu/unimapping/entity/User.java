package miu.edu.unimapping.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String email;

    private String password;

    private String firstName;

    private String lastName;

    @OneToMany
    @JoinTable(name = "user_id")
    private List<Review> reviews = new ArrayList<>();

    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;
}
