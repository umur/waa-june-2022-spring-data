package lab3.lab3.entity.user_address;

import lab3.lab3.entity.Review;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
public class User_JT {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;

    @OneToOne
    private Address_JT addressJT;

}
