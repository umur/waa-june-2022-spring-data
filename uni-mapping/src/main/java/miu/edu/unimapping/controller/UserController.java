package miu.edu.unimapping.controller;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import miu.edu.unimapping.dto.UserDto;
import miu.edu.unimapping.entity.User;
import miu.edu.unimapping.repository.UserRepository;
import miu.edu.unimapping.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public List<UserDto> findAll(){
        return userService.getAllUser();
    }
    @PostMapping
    public User addUser(@RequestBody UserDto userDto){
        return userService.addUser(userDto);
    }

    @PutMapping("/{id}")
    public User Update(@RequestBody UserDto userDto, @PathVariable Integer id){
        return userService.updateUser(userDto, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        userService.deleteUser(id);
    }



}
