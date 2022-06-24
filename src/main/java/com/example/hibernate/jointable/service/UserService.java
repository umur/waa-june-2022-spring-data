package com.example.hibernate.jointable.service;


import com.example.hibernate.jointable.dto.UserDto;
import com.example.hibernate.jointable.entity.User;

import java.util.List;

public interface UserService {

    List<User> findAll();
    User findById(int id);
    User addUser(UserDto userDto);
    User updateUser(User user);
    void deleteById(int id);
}
