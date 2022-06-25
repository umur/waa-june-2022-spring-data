package edu.miu.cs545.jointable.dto;

import lombok.Data;

@Data
public class ReviewDto {
    private Integer id;
    private String comment;
    private Integer userId;
    private double rating;

}
