package edu.miu.cs545.joincolumn.dto;

import edu.miu.cs545.joincolumn.entity.Address;
import lombok.Data;

import java.io.Serializable;

@Data
public class UserDto implements Serializable {
    private Integer id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private Address address;
}
