package com.data.springData.service.impl;

import com.data.springData.entity.User;
import com.data.springData.repo.UserRepo;
import com.data.springData.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private  final UserRepo userRepo;
    @Override
    public void save(User p) {
        userRepo.save(p);

    }

    @Override
    public void delete(int id) {
        userRepo.deleteById(id);
    }

    @Override
    public User getById(int id) {
        return (User) userRepo.findById(id).get();
    }
}
