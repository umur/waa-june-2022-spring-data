package miu.edu.unimapping.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity@Data
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @OneToMany
    @JoinColumn(name = "category_id")
    private List<Product> products = new ArrayList<>();
}
