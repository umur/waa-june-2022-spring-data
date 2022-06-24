package lab3.lab3.entity.user_review_table;

import lab3.lab3.entity.Address;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users_JT")
public class User_JT {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;

    //@JsonManagedReference
    @OneToMany
    private List<Review_JT> reviews_JT;



}
