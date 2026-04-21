package com.example.spring.service;

import com.example.spring.DTO.UserRequestDTO;
import com.example.spring.DTO.response.UserResponseDTO;

public interface UserService {
    UserResponseDTO save(UserRequestDTO userDTO);
}
