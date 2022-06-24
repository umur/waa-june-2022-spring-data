package lab3.DTO;

import lab3.model.bidirectional.Review;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

    @Data
    @Entity
    @NoArgsConstructor
    @AllArgsConstructor
    public class UserDto {
        @Id
        private int id;
        private  String email;
        private String password;
        private  String firstname;
        private  String lastname;
//        @OneToMany(mappedBy ="user")
//        private List<Review> reviewList;
}
