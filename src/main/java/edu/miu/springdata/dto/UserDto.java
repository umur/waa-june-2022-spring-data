package edu.miu.springdata.dto;


import edu.miu.springdata.entity.Address;
import edu.miu.springdata.entity.Product;
import edu.miu.springdata.entity.Review;
import lombok.Data;

import java.util.List;

@Data
public class UserDto {
    private int id;

    private String email;
    private String firstname;
    private String lastname;

    private Address address;

    private List<Product> products;

    private List<Review> reviews;
}
