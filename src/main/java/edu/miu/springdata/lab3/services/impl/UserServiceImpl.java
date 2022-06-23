package edu.miu.springdata.lab3.services.impl;

import edu.miu.springdata.lab3.repositories.UserRepo;
import edu.miu.springdata.lab3.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    @Autowired
    private final UserRepo userRepo;
}
