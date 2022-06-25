//package lab3.model.jointTable;
//
//import lab3.model.bidirectional.Product;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import javax.persistence.*;
//import java.util.List;
//
//    @Data
//    @Entity
//    @AllArgsConstructor
//    @NoArgsConstructor
//    public class Category {
//        @Id
//        private  int id;
//        private String name;
//        @OneToMany
//        @JoinTable(name= "pro-id")
//        private List<Product> products;
//    }
//
//
