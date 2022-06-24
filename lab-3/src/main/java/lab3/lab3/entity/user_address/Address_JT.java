package lab3.lab3.entity.user_address;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Address_JT {
    @Id
    @GeneratedValue
    private int id;
    private String street;
    private String zip;
    private String city;
}
