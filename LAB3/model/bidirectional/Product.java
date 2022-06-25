package lab3.model.bidirectional;

import lab3.model.bidirectional.Category;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private double price;
    private  int rating;
    @ManyToOne
    private Category category;
}
