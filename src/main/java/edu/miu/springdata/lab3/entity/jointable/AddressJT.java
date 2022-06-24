package edu.miu.springdata.lab3.entity.jointable;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class AddressJT {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @OneToOne
    private UserJT userjt;

}
