package com.example.datai.service.impl;

import com.example.datai.dto.ProductDto;
import com.example.datai.entity.Product;
import com.example.datai.entity.User;
import com.example.datai.repository.UserRepo;
import com.example.datai.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<ProductDto> findAllProductByCreatedByUser(long id) {

        List<ProductDto> productDtos = new ArrayList<>();

      for(User user: userRepo.findAll()){
          if(user.getId() == id){
              for(Product product: user.getProducts()) {
                  var dto = modelMapper.map(product,ProductDto.class );
                  productDtos.add(dto);
              }
          }
        }

        return productDtos;
    }



}
