package edu.miu.cs545.springdatai.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

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

    @ManyToOne
    @JoinColumn(name = "id_user")
    @JsonBackReference
    private User user;

    @ManyToOne
    @JsonBackReference
    private Category category;

    @OneToMany(mappedBy = "product", fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<Review> reviews;
}
