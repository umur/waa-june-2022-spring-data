package lab3.lab3.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Review {
    @Id
    @GeneratedValue
    private int id;
    private String comment;

    //@JsonBackReference
    @OneToOne
    private User user;
}
