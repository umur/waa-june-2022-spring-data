package lab3.lab3.entity.entity_bi;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Address_bi {
    @Id
    @GeneratedValue
    private int id;
    private String street;
    private String zip;
    private String city;

    @OneToOne
    private User_bi user;
}
