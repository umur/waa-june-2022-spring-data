package lab3.lab3.entity.entity_bi;

import javax.persistence.*;

@Entity
public class Review_bi {
    @Id
    @GeneratedValue
    private int id;
    private String comment;

    @ManyToOne
    private User_bi user;
    //@JsonBackReference
//    @OneToOne
//    private User user;
}
