package com.data.springData.entity.joincolumn;

import com.data.springData.entity.User;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class ReviewJT {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int jtid;
    private String commentjt;
}
