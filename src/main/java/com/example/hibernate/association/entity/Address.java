package com.example.hibernate.association.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String street;
    private String zip;
    private String city;

    @OneToOne(mappedBy = "address", cascade = CascadeType.ALL)
    private User user;
}
