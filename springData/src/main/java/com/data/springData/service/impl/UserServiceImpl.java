package com.data.springData.service.impl;

import com.data.springData.dto.UserDto;
import com.data.springData.entity.User;
import com.data.springData.repo.UserRepo;
import com.data.springData.service.UserService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private  final UserRepo userRepo;

    @Autowired
    private final ModelMapper modelMapper;
    @Override
    public void save(UserDto p) {
        userRepo.save(modelMapper.map(p,User.class));

    }

    @Override
    public void delete(int id) {
        userRepo.deleteById(id);
    }

    @Override
    public User getById(int id) {
        return (User) userRepo.findById(id).get();
    }

    @Override
    public List<UserDto> getAll() {
        return StreamSupport.stream(userRepo.findAll().spliterator(), false)
                .map(m->modelMapper.map(m,UserDto.class))
                .collect(Collectors.toList());
    }
}
