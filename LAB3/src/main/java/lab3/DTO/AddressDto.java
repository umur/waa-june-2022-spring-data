package lab3.DTO;

import lab3.model.bidirectional.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressDto {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)

        private int id;
        private String street;
        private float zip;
        private String city;
//        @OneToOne(mappedBy = "address")
//        private User user;

}
