package edu.miu.springdata.lab3.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class ReviewDto {

    private int id;
    private String comment;
}
