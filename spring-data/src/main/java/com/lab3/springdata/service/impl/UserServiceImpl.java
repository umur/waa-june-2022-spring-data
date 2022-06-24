package com.lab3.springdata.service.impl;

import com.lab3.springdata.dto.UserDto;
import com.lab3.springdata.model.User;
import com.lab3.springdata.repo.UsersRepo;
import com.lab3.springdata.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    private UsersRepo usersRepo;
    private ModelMapper modelMapper;

    public UserServiceImpl(UsersRepo usersRepo, ModelMapper modelMapper){
        this.usersRepo = usersRepo;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<UserDto> findAll() {
        List<User> users = new ArrayList<>();
        List<UserDto> userDtos = new ArrayList<>();
        usersRepo.findAll().forEach(u->  {
            System.out.println(u.getAddress().toString());
            users.add(u);
        });
        users.forEach(u1-> {
            var result = modelMapper.map(u1, UserDto.class);
            userDtos.add(result);
        });
        return userDtos;
    }

    @Override
    public UserDto create(UserDto userDto) {
        var user = modelMapper.map(userDto, User.class);
        return modelMapper.map(usersRepo.save(user), UserDto.class);
    }

    @Override
    public UserDto findById(int id) {
        User user = usersRepo.findById(id).orElseThrow(() -> new RuntimeException(String.format("Not found")));
        return modelMapper.map(user, UserDto.class);
    }

    @Override
    public void delete(int id) {
        usersRepo.deleteById(id);
    }
}
