package lab3.DTO;

import lab3.model.bidirectional.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReviewDto {
    @Id
    @GeneratedValue
    private int id;
    private String comment;
    @ManyToOne
    private User user;
}
