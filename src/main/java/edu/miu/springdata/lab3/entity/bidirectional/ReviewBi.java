package edu.miu.springdata.lab3.entity.bidirectional;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class ReviewBi {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String commentb;

    @ManyToOne
    private UserBi userb;
}
