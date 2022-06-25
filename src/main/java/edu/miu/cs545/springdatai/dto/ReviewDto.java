package edu.miu.cs545.springdatai.dto;

import lombok.Data;

@Data
public class ReviewDto {
    private Integer id;
    private String comment;
    private Integer userId;
    private double rating;

}
