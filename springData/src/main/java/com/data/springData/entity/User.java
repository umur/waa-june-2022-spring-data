package com.data.springData.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="users")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;



}
