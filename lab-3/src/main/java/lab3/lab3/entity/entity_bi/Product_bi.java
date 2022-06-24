package lab3.lab3.entity.entity_bi;

import javax.persistence.*;

@Entity
public class Product_bi {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private double price;

    @ManyToOne
    private Category_bi category;
}
