package lab3.lab3.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    @OneToMany
    //@JoinTable
    private List<Product> products;
//    @OneToOne
//    private Product products;
}
