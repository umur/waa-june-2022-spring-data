package edu.miu.springdata.lab3.controllers;

import edu.miu.springdata.lab3.dtos.CategoryDto;
import edu.miu.springdata.lab3.dtos.UserDto;
import edu.miu.springdata.lab3.entity.User;
import edu.miu.springdata.lab3.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/users")
public class UserController {
    private final UserService userService;

    @PostMapping
    public void save(@RequestBody UserDto userDto) {
        userService.save(userDto);
    }

    @GetMapping
    public List<UserDto> getAll() {
        return userService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDto> getById(@PathVariable int id) {
        var user = userService.getById(id);
        return ResponseEntity.ok(user);
    }

    @PostMapping("/{id}")
    public ResponseEntity<UserDto> update(@PathVariable int id, @RequestBody UserDto userDto) {
        var user = userService.update(id, userDto);
        return ResponseEntity.ok(user);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        userService.delete(id);
    }
}