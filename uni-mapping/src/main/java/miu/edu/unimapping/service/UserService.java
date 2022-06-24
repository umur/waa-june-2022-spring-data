package miu.edu.unimapping.service;

import miu.edu.unimapping.dto.UserDto;
import miu.edu.unimapping.entity.User;

import java.util.Collection;
import java.util.List;

public interface UserService {
    public List<UserDto> getAllUser();

    public User addUser(UserDto userDto);

    public void deleteUser(Integer id);

    public User updateUser(UserDto userDto, Integer id);
}
