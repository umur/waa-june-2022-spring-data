package lab3.lab3.dto;

import lombok.Data;
import lombok.Getter;

@Data
public class AddressDTO {
    private int id;
    private String street;
    private String zip;
    private String city;
}
