package lab3.lab3.service.user;

import lab3.lab3.dto.UserDTO;

import java.util.List;

public interface UserService {

    List<UserDTO> getUsers();

    void create(UserDTO userDTO);

    void update(UserDTO userDTO, int id);

    void delete(int id);

}
