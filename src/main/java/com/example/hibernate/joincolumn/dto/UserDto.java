package com.example.hibernate.joincolumn.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@RequiredArgsConstructor
public class UserDto {

    private String firstName;
    private String lastName;
    private String email;
    List<ReviewDto> reviews;
    private AddressDto address;

}
