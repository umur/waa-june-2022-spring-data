package lab3.model.bidirectional;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private  String email;
    private String password;
    private  String firstname;
    private  String lastname;
    @OneToMany(fetch = FetchType.EAGER, mappedBy ="user")
    private List<Review> reviewList;
    @OneToOne
    private AddressBi address;

}
