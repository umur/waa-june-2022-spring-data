package miu.edu.springdata.dto;

import miu.edu.springdata.model.User;

import javax.persistence.OneToOne;

public class ReviewDto {

    private int id;
    private String comment;
    private User user;

}
