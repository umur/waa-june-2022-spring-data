package edu.miu.springdata.lab3.entity.jointable;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class ReviewJT {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int jtid;
    private String commentjt;
}
