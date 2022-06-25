package edu.miu.cs545.joincolumn.service;

import edu.miu.cs545.joincolumn.dto.ReviewDto;
import edu.miu.cs545.joincolumn.dto.UserDto;

import java.util.List;

public interface UserService {
    UserDto createNewUser(UserDto userDto);

    List<UserDto> getAllUsers();

    UserDto getUserById(Integer id);

    Object getById(int id);

    UserDto updateUserById(Integer id, UserDto userDto);

    void deleteUserById(Integer id);

    void createNewReview(int id, ReviewDto reviewDto);
}
