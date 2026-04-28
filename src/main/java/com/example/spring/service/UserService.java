package com.example.spring.service;

import com.example.spring.DTO.UserRequestDTO;
import com.example.spring.DTO.response.UserResponseDTO;
import com.example.spring.entity.User;

import java.util.List;

public interface UserService {
    UserResponseDTO save(UserRequestDTO userDTO);
    UserResponseDTO findById(Long id);
    List<UserResponseDTO> findAll();
    UserResponseDTO  deleteById(Long id);

    int getAllAgeSum();


}
