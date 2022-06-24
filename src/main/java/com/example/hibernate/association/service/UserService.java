package com.example.hibernate.association.service;


import com.example.hibernate.association.dto.UserDto;
import com.example.hibernate.association.entity.User;

import java.util.List;

public interface UserService {

    List<User> findAll();
    User findById(int id);
    User addUser(UserDto userDto);
    User updateUser(User user);
    void deleteById(int id);
}
