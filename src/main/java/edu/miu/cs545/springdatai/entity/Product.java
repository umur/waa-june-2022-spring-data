package edu.miu.cs545.springdatai.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name="product_name")
    private String name;
    private double price;
    private double rating;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;

    @ManyToOne
    private Category category;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Review> reviews;
}
