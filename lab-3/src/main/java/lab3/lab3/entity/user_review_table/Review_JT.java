package lab3.lab3.entity.user_review_table;

import javax.persistence.*;

@Entity
public class Review_JT {
    @Id
    @GeneratedValue
    private int id;
    private String comment;

    //@JsonBackReference
    @ManyToOne
    private User_JT user_JT;
}
