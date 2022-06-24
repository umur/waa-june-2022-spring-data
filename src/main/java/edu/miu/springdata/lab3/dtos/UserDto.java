package edu.miu.springdata.lab3.dtos;

import edu.miu.springdata.lab3.entity.Address;
import edu.miu.springdata.lab3.entity.Review;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Data
public class UserDto {

    private int id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;

    private List<Review> reviews;

    private Address address;
}
