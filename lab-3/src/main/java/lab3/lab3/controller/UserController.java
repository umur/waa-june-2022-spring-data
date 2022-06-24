package lab3.lab3.controller;

import lab3.lab3.dto.UserDTO;
import lab3.lab3.service.user.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping
    public List<UserDTO> getUsers() {
        return userService.getUsers();
    }

    @PostMapping
    public void saveUser(@RequestBody UserDTO userDTO) {
        userService.create(userDTO);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        userService.delete(id);
    }

    @PutMapping("/{id}")
    public void update(@RequestBody UserDTO userDTO, @PathVariable int id) {
        userService.update(userDTO, id);
    }
}
