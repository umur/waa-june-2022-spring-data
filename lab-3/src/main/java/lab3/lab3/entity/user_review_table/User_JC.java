package lab3.lab3.entity.user_review_table;

import lab3.lab3.entity.Address;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users_JC")
public class User_JC {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;

    //@JsonManagedReference
    @OneToMany(mappedBy = "user_JC")
    private List<Review_JC> reviews_JC;


}
