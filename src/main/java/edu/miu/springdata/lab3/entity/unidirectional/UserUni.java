package edu.miu.springdata.lab3.entity.unidirectional;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class UserUni {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;



    @OneToMany
    @JoinColumn  // if we do not add this it will create mapper table
    private List<ReviewUni> reviewsu;

    @OneToOne
    private AddressUni addressu;

}
