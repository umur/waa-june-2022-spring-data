package edu.miu.springdata.lab3.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class AddressDto {

    private int id;
    private String street;
    private int zip;
    private String city;
}
