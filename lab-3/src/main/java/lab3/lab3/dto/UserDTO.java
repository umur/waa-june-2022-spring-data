package lab3.lab3.dto;

import lab3.lab3.entity.Address;
import lab3.lab3.entity.Review;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private int id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private List<Review> reviews;
    private Address address;
}
