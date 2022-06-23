package edu.miu.springdata.lab3.entity;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="address")
@Data
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String street;
    private String city;
    private String zip;

    @OneToOne
    private User user;
}
