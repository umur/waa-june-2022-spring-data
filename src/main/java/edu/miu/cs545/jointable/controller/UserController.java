package edu.miu.cs545.jointable.controller;

import edu.miu.cs545.jointable.dto.ReviewDto;
import edu.miu.cs545.jointable.dto.UserDto;
import edu.miu.cs545.jointable.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;


    @PostMapping
    public UserDto createNewUser(@RequestBody UserDto userDto){
        return userService.createNewUser(userDto);
    }

    @PostMapping("/{id}/review")
    public void createNewReview(@PathVariable int id, @RequestBody ReviewDto reviewDto){
        userService.createNewReview(id, reviewDto);
    }

    @GetMapping
    public List<UserDto> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public UserDto getUserById(@PathVariable Integer id){
        return userService.getUserById(id);
    }

    @GetMapping("/{id}/reviews")
    public Object getReviewsByUserId(@PathVariable int id){
        return (userService.getById(id));
    }
    //patch mapping specific update only
    @PatchMapping("/{id}")
//    @PutMapping("/{id}")
    public UserDto updateUserById(@PathVariable Integer id, @RequestBody UserDto userDto){
        return userService.updateUserById(id,userDto);
    }

    @DeleteMapping("/{id}")
    public void deleteUserById(@PathVariable Integer id){
        userService.deleteUserById(id);
    }
}
