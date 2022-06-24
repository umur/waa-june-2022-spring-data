package com.example.hibernate.joincolumn.service;
import com.example.hibernate.joincolumn.dto.UserDto;
import com.example.hibernate.joincolumn.entity.User;

import java.util.List;

public interface UserService {

    List<User> findAll();
    User findById(int id);
    User addUser(UserDto userDto);
    User updateUser(User user);
    void deleteById(int id);
}
