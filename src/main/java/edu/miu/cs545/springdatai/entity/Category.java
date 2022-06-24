package edu.miu.cs545.springdatai.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @OneToMany(mappedBy = "category", fetch = FetchType.LAZY)
    //@JoinTable // OPTIONAL
    @JsonManagedReference
    private List<Product> products;
}
