package lab3.lab3.entity.user_address;

import javax.persistence.*;

@Entity
public class Address_JC {
    @Id
    @GeneratedValue
    private int id;
    private String street;
    private String zip;
    private String city;

    @OneToOne
    @JoinColumn
    User_JC user_jc;
}
