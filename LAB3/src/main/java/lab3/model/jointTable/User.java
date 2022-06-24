//package lab3.model.jointTable;
//
//import lab3.model.bidirectional.AddressBi;
//import lab3.model.bidirectional.Review;
//import lombok.Data;
//
//import javax.persistence.*;
//import java.util.List;
//@Entity
//@Data
//public class User {
//    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE)
//    private int id;
//    private  String email;
//    private String password;
//    private  String firstname;
//    private  String lastname;
//    @OneToMany
//    private List<Review> reviewList;
//    @OneToOne
//    private AddressBi address;
//
//}
