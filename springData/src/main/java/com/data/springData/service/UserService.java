package com.data.springData.service;

import com.data.springData.dto.UserDto;
import com.data.springData.entity.User;

import java.util.List;

public interface UserService {

    void save(UserDto p);
    void delete(int id);

    User getById(int id);

    List<UserDto> getAll();
}
