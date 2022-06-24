package edu.miu.springdata.controller;

import edu.miu.springdata.dto.UserDto;
import edu.miu.springdata.entity.Product;
import edu.miu.springdata.entity.User;
import edu.miu.springdata.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/users/")
    public void save(@RequestBody UserDto p) {
        userService.save(p);
    }

    @GetMapping("/users/")
    public List<UserDto> getAll() {
        return userService.getAll();
    }

    @GetMapping("/users/{id}")
    public User getById(@PathVariable int id) {
        return userService.getById(id);
    }

    @DeleteMapping("/users/{id}")
    public void delete(@PathVariable int id) {
        userService.delete(id);
    }

    @PutMapping("/users/{id}")
    public void update(@PathVariable("id") int id, @RequestBody UserDto user) {
        userService.updateUser(user, id);
    }

    @GetMapping("/users/{id}/products")
    public List<Product> getReviewsByProductId(@PathVariable int id) {
        return userService.getById(id).getProducts();
    }


}
