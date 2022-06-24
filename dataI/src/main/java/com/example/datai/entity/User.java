package com.example.datai.entity;


import com.example.datai.entity.Address;
import com.example.datai.entity.Review;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;

    @OneToMany //(fetch = FetchType.LAZY, mappedBy = "user") //----
    @JsonManagedReference // ---
    private List<Review> reviews;
    @OneToMany
    @JsonManagedReference
    private List<Product> products;

    @JsonBackReference  //----
    @OneToOne (mappedBy ="user")
    private Address address;


}
