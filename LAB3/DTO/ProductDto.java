package lab3.DTO;

import lab3.model.bidirectional.Category;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

    @Entity
    @Data
    public class ProductDto {
        @Id
        @GeneratedValue
        private int id;
        private String name;
        private double price;
        private  int rating;
//        @ManyToOne
//        private Category category;
//       // private  double sellinprice;
}
