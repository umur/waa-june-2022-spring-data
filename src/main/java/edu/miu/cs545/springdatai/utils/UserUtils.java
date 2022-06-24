package edu.miu.cs545.springdatai.utils;

import edu.miu.cs545.springdatai.dto.UserDto;
import edu.miu.cs545.springdatai.entity.User;
import org.modelmapper.ModelMapper;

public class UserUtils {
    private static final ModelMapper mapper = new ModelMapper();

    public static UserDto parseUserToUserDto(User user){
        return mapper.map(user, UserDto.class);
    }

    public static User parseUserDtoToUser(UserDto userDto){
        return mapper.map(userDto,User.class);
    }
}
