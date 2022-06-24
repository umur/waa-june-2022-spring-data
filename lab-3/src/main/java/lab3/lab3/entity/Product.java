package lab3.lab3.entity;

import javax.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue
    private int id;
    //private String name;
    private double price;
    //private String rating;

//    @OneToOne(mappedBy="products")
//    private Category category;
    @ManyToOne
    private Category category;


}
