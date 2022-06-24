package com.data.springData.entity.joincolumn;

import com.data.springData.entity.User;
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
