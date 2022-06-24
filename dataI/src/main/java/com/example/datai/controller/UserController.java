package com.example.datai.controller;

import com.example.datai.dto.ProductDto;
import com.example.datai.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

//    @GetMapping(path = "{/id}")
//    public List<ProductDto> findAllProductCreatedByUser(@PathVariable("id") int id){
//        return userService.findAllProductByCreatedByUser(id);
//    }
}
