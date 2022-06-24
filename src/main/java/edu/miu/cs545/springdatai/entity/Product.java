package edu.miu.cs545.springdatai.entity;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    String name;
    double price;
    double rating;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
