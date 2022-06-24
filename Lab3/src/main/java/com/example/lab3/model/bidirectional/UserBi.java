package com.example.lab3.model.bidirectional;

import lombok.Data;
import org.springframework.web.servlet.view.freemarker.FreeMarkerView;

import javax.persistence.*;
import java.util.List;

@Entity
@Data

public class UserBi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    @OneToMany(mappedBy = "userBi")
    List<ReviewBi> reviewBis;
    @OneToOne
    AddressBi addressBi;



}
