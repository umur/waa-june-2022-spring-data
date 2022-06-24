package Domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@Data
public class Address {
    @Id
    @GeneratedValue
    private int id;
    private String street;
    private String zip;
    private String city;
    @OneToOne(mappedBy = "address")
    private User user;



}
