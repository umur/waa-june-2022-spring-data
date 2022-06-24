package miu.edu.springdata.dto;

import miu.edu.springdata.model.Address;
import miu.edu.springdata.model.Review;

import java.util.ArrayList;
import java.util.List;

public class UserDto {
    private int id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    List<Review> reviews = new ArrayList<>();
    Address address;
}
