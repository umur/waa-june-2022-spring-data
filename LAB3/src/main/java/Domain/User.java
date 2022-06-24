package Domain;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue
    private int id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
   //bidirectional
    @OneToMany(mappedBy="user")
    private List<Review> reviews;
    @OneToOne
    private Address address;



}
