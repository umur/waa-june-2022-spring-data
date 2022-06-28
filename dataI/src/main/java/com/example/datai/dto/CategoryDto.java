package com.example.datai.dto;


import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class CategoryDto {

    private long id;
    private String name;
}
