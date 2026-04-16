package com.example.spring.mapper;

import com.example.spring.DTO.UserRequestDTO;
import com.example.spring.entity.User;

public interface UserMapper {
    User toUser(UserRequestDTO userRequestDTO);
}
