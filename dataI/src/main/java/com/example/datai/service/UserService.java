package com.example.datai.service;

import com.example.datai.dto.ProductDto;
import com.example.datai.dto.UserDto;

import java.util.List;

public interface UserService {

    List<ProductDto> findAllProductByCreatedByUser(long id);

    List<UserDto> findAllUsers();
}
