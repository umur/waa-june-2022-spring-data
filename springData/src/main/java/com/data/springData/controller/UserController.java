package com.data.springData.controller;

import com.data.springData.dto.UserDto;
import com.data.springData.entity.User;
import com.data.springData.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;
    @PostMapping
    public void save(@RequestBody UserDto p) {
        userService.save(p);
    }

    @GetMapping
    public List<UserDto> getAll() { return userService.getAll();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        userService.delete(id);
    }


}
