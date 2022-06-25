package edu.miu.productreview.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String street;
    private String zip;
    private String city;

    @OneToOne
    @JoinColumn(name = "user_id")
    private Users users;
}
