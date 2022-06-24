package lab3.lab3.service.user;

import lab3.lab3.dto.UserDTO;
import lab3.lab3.entity.User;
import lab3.lab3.repository.UserRepo;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepo userRepo;
    private final ModelMapper modelMapper;

    @Override
    public List<UserDTO> getUsers() {
        //return null;
        return userRepo.findAll().stream().map(user -> modelMapper.map(user, UserDTO.class)).toList();
    }

    @Override
    public void create(UserDTO userDTO) {
        userRepo.save(modelMapper.map(userDTO, User.class));
    }

    @Override
    public void update(UserDTO userDTO, int id) {
        userRepo.save(modelMapper.map(userDTO, User.class));
    }

    @Override
    public void delete(int id) {
        userRepo.deleteById(id);
    }
}
