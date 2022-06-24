package com.lab3.springdata.controller;

import com.lab3.springdata.dto.UserDto;
import com.lab3.springdata.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<UserDto> findAll() {return userService.findAll();}

    @GetMapping("/{id}")
    public UserDto findById(@PathVariable int id) {
        return userService.findById(id);
    }

    @PostMapping
    public UserDto create(@RequestBody UserDto userDto) {
        return userService.create(userDto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        userService.delete(id);
    }

}
