package miu.edu.springdataunidirectional.model;

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

    @OneToOne
    private User user;
}
