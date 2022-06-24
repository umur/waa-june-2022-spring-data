package com.example.hibernate.joincolumn.service.impl;

import com.example.hibernate.joincolumn.dto.UserDto;
import com.example.hibernate.joincolumn.entity.User;
import com.example.hibernate.joincolumn.repo.UserRepo;
import com.example.hibernate.joincolumn.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepo userRepo;
    @Autowired
    private ModelMapper modelMapper;


    public List<User> findAll() {
        return (List<User>) userRepo.findAll();
    }

    public User findById(int id) {
        return userRepo.findById(id).get();
    }
    public User addUser(UserDto userDto) {
        return userRepo.save(modelMapper.map(userDto, User.class));
    }
    public User updateUser(User user){
        return userRepo.save(user);
    }
    public void deleteById(int id){
        userRepo.deleteById(id);
    }

}
