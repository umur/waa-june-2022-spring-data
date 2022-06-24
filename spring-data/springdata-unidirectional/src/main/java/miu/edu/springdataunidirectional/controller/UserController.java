package miu.edu.springdataunidirectional.controller;

import miu.edu.springdataunidirectional.dto.UserDto;
import miu.edu.springdataunidirectional.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping
    public List<UserDto> findAll() {
        return userService.findAll();
    }

    @PostMapping
    public void create(@RequestBody UserDto user) {
        userService.create(user);
    }

    @PutMapping("/{id}")
    public UserDto update(@RequestBody UserDto user, @PathVariable int id) {
        return userService.update(user, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        userService.delete(id);
    }
}
