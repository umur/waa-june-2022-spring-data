package miu.edu.springdata.dto;

import miu.edu.springdata.model.Address;
import miu.edu.springdata.model.Category;
import miu.edu.springdata.model.Review;

import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.ArrayList;
import java.util.List;

public class ProductDto {

    private int id;
    private String name;
    private double price;
    private double rating;
    private Category category;

}
