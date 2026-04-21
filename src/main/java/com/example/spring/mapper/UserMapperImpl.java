package com.example.spring.mapper;

import com.example.spring.DTO.UserRequestDTO;
import com.example.spring.DTO.response.UserResponseDTO;
import com.example.spring.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapperImpl implements UserMapper{
    @Override
    public User toUser(UserRequestDTO userRequestDTO) {
        return new User(userRequestDTO.getName(),
                userRequestDTO.getAge());
    }

    @Override
    public UserResponseDTO toDTO(User user) {
        return new UserResponseDTO(user.getId(),
                user.getName(),
                user.getAge());
    }


}
