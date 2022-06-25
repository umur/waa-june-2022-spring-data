package com.cs545waa.lab03.dto;

import com.cs545waa.lab03.entity.Address;
import com.cs545waa.lab03.entity.Review;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class AppUserDTO {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Address address;
    private List<Review> reviews;
}
