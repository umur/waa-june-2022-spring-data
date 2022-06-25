package com.example.lab3.DTO;

import com.example.lab3.model.bidirectional.AddressBi;
import com.example.lab3.model.bidirectional.ReviewBi;

import java.util.List;

public class UserBiDTO {
    private long id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private List<ReviewBi> reviewBis;
    private AddressBi addressBi;

}
