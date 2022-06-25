package edu.miu.cs545.joincolumn.service.implementation;

import edu.miu.cs545.joincolumn.dto.ReviewDto;
import edu.miu.cs545.joincolumn.dto.UserDto;
import edu.miu.cs545.joincolumn.entity.Review;
import edu.miu.cs545.joincolumn.repo.UserRepository;
import edu.miu.cs545.joincolumn.service.UserService;
import edu.miu.cs545.joincolumn.utils.ReviewUtils;
import edu.miu.cs545.joincolumn.utils.UserUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    @Override
    public UserDto createNewUser(UserDto userDto) {
        return UserUtils.parseUserToUserDto(userRepository.save(UserUtils.parseUserDtoToUser(userDto)));
    }

    @Override
    public List<UserDto> getAllUsers() {
        return userRepository.findAll().stream().map(u-> UserUtils.parseUserToUserDto(u)).toList();
    }

    @Override
    public UserDto getUserById(Integer id) {
        return UserUtils.parseUserToUserDto(userRepository.getReferenceById(id));
    }

    @Override
    public List<Review> getById(int id) {
        return userRepository.findById(id).get().getReviews();
    }

    @Override
    public UserDto updateUserById(Integer id, UserDto userDto) {
        return null;
    }

    @Override
    public void deleteUserById(Integer id) {
        userRepository.deleteById(id);
    }

    @Override
    public void createNewReview(int id, ReviewDto reviewDto) {
        System.out.println(reviewDto);
        userRepository.findById(id).get().addReviews(ReviewUtils.parseReviewDtoToReview(reviewDto));
    }
}
