package edu.miu.springdata.lab3.services;

<<<<<<< HEAD
import edu.miu.springdata.lab3.dtos.ReviewDto;
=======
import edu.miu.springdata.lab3.entity.User;
>>>>>>> origin

import java.util.List;

public interface ReviewService {
<<<<<<< HEAD

    List<ReviewDto> getAll();

    void update(ReviewDto reviewDto, int id);

    void create(ReviewDto reviewDto);

    void delete(int id);
=======
    void save(User p);

    void delete(int id);

    User getById(int id);

    List<User> getAll();
>>>>>>> origin
}
