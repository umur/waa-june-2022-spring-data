package com.example.datai.service;

import com.example.datai.dto.ProductDto;

import java.util.List;

public interface UserService {
    List<ProductDto> findAllProductByCreatedByUser(int id);
}
