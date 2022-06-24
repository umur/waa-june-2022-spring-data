package com.example.hibernate.jointable.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@RequiredArgsConstructor
public class UserDto {
    private int Id;
    private String firstName;
    private String lastName;
    private String email;
    List<ReviewDto> reviews;
    private AddressDto address;

}
