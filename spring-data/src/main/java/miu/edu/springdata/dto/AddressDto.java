package miu.edu.springdata.dto;

import miu.edu.springdata.model.User;

import javax.persistence.OneToOne;

public class AddressDto {
    private int id;
    private String street;
    private int zip;
    private String City;
    private User user;
}
