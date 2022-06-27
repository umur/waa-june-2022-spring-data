package com.cs545waa.lab03.dto;

import com.cs545waa.lab03.entity.AppUser;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AddressDTO {
    private int id;
    private String street;
    private String city;
    private String state;
    private String zip;
    private AppUserDTO appUser;
}
