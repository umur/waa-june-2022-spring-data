package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Address {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String street;
  private String zip;
  private String city;

}
