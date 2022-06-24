package com.example.hibernate.joincolumn.controller;

import com.example.hibernate.joincolumn.dto.UserDto;
import com.example.hibernate.joincolumn.entity.User;
import com.example.hibernate.joincolumn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("")
    public List<User> findAllUsers(){
        return userService.findAll();
    }

    @PostMapping("")
    public User addUser(@RequestBody UserDto userDto){
        return userService.addUser(userDto);
    }

    @DeleteMapping("{id}")
    public void deleteUser(@PathVariable int id){
        userService.deleteById(id);
    }

    @PutMapping("")
    public User updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }

}
