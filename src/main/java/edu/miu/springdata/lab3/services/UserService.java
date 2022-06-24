package edu.miu.springdata.lab3.services;

import edu.miu.springdata.lab3.dtos.UserDto;

import java.util.List;

public interface UserService {
    void save(UserDto p);

    void delete(int id);

    UserDto getById(int id);

    List<UserDto> getAll();

    void update(UserDto userDto, int id);
}
