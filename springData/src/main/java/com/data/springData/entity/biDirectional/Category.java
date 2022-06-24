package com.data.springData.entity.biDirectional;

import javax.persistence.*;
import java.util.List;

@Entity
public class Category {
    @Id @GeneratedValue
    private int id;
    private int name;
    @OneToMany
    private List<Product> products;
}
