package edu.miu.cs545.joincolumn.dto;

import lombok.Data;

@Data
public class ReviewDto {
    private Integer id;
    private String comment;
    private Integer userId;
    private double rating;

}
