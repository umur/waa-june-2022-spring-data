package DTO;

import Domain.Address;
import Domain.Review;
import Domain.User;
import lombok.Data;


import java.util.ArrayList;
import java.util.List;
@Data
public class UserDto {
    private int id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private List<Review> reviews;
    private Address address;

//   public UserDto toDto(User user) {
//     UserDto userDto= new UserDto();
//     userDto.setId(user.getId());
//     userDto.setEmail(user.getEmail());
//     userDto.setPassword(user.getPassword());
//     userDto.setFirstName(user.getFirstName());
//     userDto.setLastName(user.getLastName());
//     userDto.setReviews(user.getReviews());
//     userDto.setAddress(user.getAddress());
//     return userDto;
//   }
   public User toEntity(UserDto userDto){
       User user= new User();
       user.setId(userDto.getId());
       user.setEmail(userDto.getEmail());
       user.setPassword(userDto.getPassword());
       user.setFirstName(userDto.getFirstName());
       user.setLastName(userDto.getLastName());
       user.setReviews(userDto.getReviews());
       user.setAddress(userDto.getAddress());
       return user;
   }







}