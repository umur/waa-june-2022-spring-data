package com.lab3.springdata.service;

import com.lab3.springdata.dto.UserDto;

import java.util.List;

public interface UserService {
    List<UserDto> findAll();

    UserDto create(UserDto userDto);

    UserDto findById(int id);

    void delete(int id);
}
