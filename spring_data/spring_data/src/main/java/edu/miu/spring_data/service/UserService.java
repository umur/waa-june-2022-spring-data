package edu.miu.spring_data.service;

import edu.miu.spring_data.dto.UserDto;
import edu.miu.spring_data.entity.Product;
import edu.miu.spring_data.entity.Review;

import java.util.List;

public interface UserService {
    List<UserDto> findAll();
    UserDto getUser(int id);
    UserDto addUser(UserDto userDto);
    UserDto updateUser(UserDto userDto , int id);
    void removeUser(int id);

    List<Product> findByUserId(Integer id);
//    List<Review> findAllReviewsOfProduct(Integer productId);

}
