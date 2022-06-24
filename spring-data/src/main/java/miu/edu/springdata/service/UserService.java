package miu.edu.springdata.service;

import miu.edu.springdata.dto.UserDto;

import java.util.List;

public interface UserService {
    List<UserDto> findAll();
    void create(UserDto user);
    UserDto update(UserDto user, int id);
    void delete(int id);
}
