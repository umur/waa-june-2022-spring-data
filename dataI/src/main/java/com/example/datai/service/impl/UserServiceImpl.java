package com.example.datai.service.impl;

import com.example.datai.dto.ProductDto;
import com.example.datai.dto.UserDto;
import com.example.datai.entity.Product;
import com.example.datai.entity.User;
import com.example.datai.repository.UserRepo;
import com.example.datai.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<ProductDto> findAllProductByCreatedByUser(int id) {

     return null;
    }
}
