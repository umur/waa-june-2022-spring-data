package lab3.lab3.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Address {
    @Id
    @GeneratedValue
    private int id;
    private String street;
    private String zip;
    private String city;

    @OneToOne
    private User user;

}
