package lab3.lab3.entity.entity_bi;

import javax.persistence.*;
import java.util.List;

@Entity
public class Category_bi {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    @OneToMany(mappedBy = "category")
    private List<Product_bi> products;
}
