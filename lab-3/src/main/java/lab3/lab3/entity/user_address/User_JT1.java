package lab3.lab3.entity.user_address;

import javax.persistence.*;

@Entity
@Table(name = "users_JT1")
public class User_JT1 {
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
