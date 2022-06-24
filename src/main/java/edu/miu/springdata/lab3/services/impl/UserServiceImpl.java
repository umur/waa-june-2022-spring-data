package edu.miu.springdata.lab3.services.impl;

import edu.miu.springdata.lab3.dtos.UserDto;
import edu.miu.springdata.lab3.entity.User;
import edu.miu.springdata.lab3.repositories.UserRepo;
import edu.miu.springdata.lab3.services.UserService;
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

    @Autowired
    private final UserRepo userRepo;

    @Autowired
    private final ModelMapper modelMapper;

    @Override
    public void save(UserDto p) {
        userRepo.save(modelMapper.map(p, User.class));
    }

    @Override
    public void delete(int id) {
        userRepo.deleteById(id);
    }

    @Override
    public UserDto getById(int id) {
        return modelMapper.map(userRepo.findById(id).get(), UserDto.class);
    }

    @Override
    public List<UserDto> getAll() {
        return StreamSupport.stream(userRepo.findAll().spliterator(), false)
                .map(u -> modelMapper.map(u, UserDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public UserDto update(UserDto userDto, int id) {
        return new UserDto();
    }
}
