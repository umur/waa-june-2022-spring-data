package Domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Data
public class Review {
     @Id
    @GeneratedValue
    private int id;
     private String comment;
     @ManyToOne
     private User user;

}
