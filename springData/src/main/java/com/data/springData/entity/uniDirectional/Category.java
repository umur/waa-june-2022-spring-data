package com.data.springData.entity.uniDirectional;

import javax.persistence.*;
import java.util.List;

@Entity(name = "CategoryBi")
@Table(name = "CategoryBi")
public class Category {
    @Id @GeneratedValue
    private int id;
    private int name;
    @OneToMany
    private List<Product> products;
}
