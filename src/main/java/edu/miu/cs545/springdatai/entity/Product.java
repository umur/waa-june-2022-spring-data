package edu.miu.cs545.springdatai.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    String name;
    double price;
    double rating;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;

    @ManyToOne
    private Category category;

    @OneToMany(mappedBy = "productId", fetch = FetchType.LAZY)
    private List<Review> reviews;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
