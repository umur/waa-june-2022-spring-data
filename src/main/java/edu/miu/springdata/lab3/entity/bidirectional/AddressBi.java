package edu.miu.springdata.lab3.entity.bidirectional;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class AddressBi {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @OneToOne
    private UserBi userb;
}
