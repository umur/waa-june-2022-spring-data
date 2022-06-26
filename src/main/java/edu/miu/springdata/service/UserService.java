package edu.miu.springdata.service;

import edu.miu.springdata.dto.UserDto;
import edu.miu.springdata.entity.User;

import java.util.List;

public interface UserService {
    void save(UserDto user);

    public void updateUser(UserDto user, Integer id);
    void delete(int id);

    User getById(int id);

    List<UserDto> getAll();
}
