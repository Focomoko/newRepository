package com.example.spring.mapper;

import com.example.spring.DTO.UserRequestDTO;
import com.example.spring.entity.User;

public class UserMapperImpl implements UserMapper{
    @Override
    public User toUser(UserRequestDTO userRequestDTO) {
        return new User(userRequestDTO.getName(),
                userRequestDTO.getAge());
    }
}
