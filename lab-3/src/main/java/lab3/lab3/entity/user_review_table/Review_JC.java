package lab3.lab3.entity.user_review_table;

import javax.persistence.*;

@Entity
public class Review_JC {
    @Id
    @GeneratedValue
    private int id;
    private String comment;

    //@JsonBackReference
    @ManyToOne
    private User_JC user_JC;
}
