package miu.edu.springdataunidirectional.dto;


import miu.edu.springdataunidirectional.model.Address;
import miu.edu.springdataunidirectional.model.Review;

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
