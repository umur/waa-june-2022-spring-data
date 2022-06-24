package lab3.lab3.entity.entity_bi;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "user_bi")
public class User_bi {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;

    //@JsonManagedReference
    @OneToMany(mappedBy = "user")
    private List<Review_bi> reviews;

    @OneToOne
    private Address_bi address;

}
