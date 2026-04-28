package com.example.spring.service;

import com.example.spring.DTO.UserRequestDTO;
import com.example.spring.DTO.response.UserResponseDTO;
import com.example.spring.entity.User;
import com.example.spring.exception.UserNotFoundException;
import com.example.spring.mapper.UserMapper;
import com.example.spring.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private UserMapper userMapper;
    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserMapper userMapper, UserRepository userRepository) {
        this.userMapper = userMapper;
        this.userRepository = userRepository;
    }

    @Override
    public UserResponseDTO save(UserRequestDTO userDTO) {
        User user = userMapper.toUser(userDTO);
        User user1 =  userRepository.save(user);
        UserResponseDTO saved = userMapper.toDTO(user1);
        return saved;
    }

    @Override
    public UserResponseDTO findById(Long id) {
        Optional<User> userOptional = userRepository.findById(id);
        if (userOptional.isEmpty()) {
            throw new UserNotFoundException("not found" + id);
        }
        User user = userOptional.get();
        return  userMapper.toDTO(user);
    }

    @Override
    public List<UserResponseDTO> findAll() {
        return userRepository.findAll().stream()
                .map( e-> userMapper.toDTO(e))
                .toList();
    }

    @Override
    public UserResponseDTO deleteById(Long id) {
        Optional<User> userOptional = userRepository.findById(id);
        if (userOptional.isEmpty()) {
            throw new UserNotFoundException("not found" + id);
        }
        User user = userOptional.get();
        userRepository.deleteById(id);

        return userMapper.toDTO(user);
    }

    @Override
    public int getAllAgeSum() {
        List<User> users = userRepository.findAll();


        return users.stream()
                .mapToInt(e -> e.getAge())
                .sum();
    }

    @Override
    public UserResponseDTO getMaxAge() {
        List<User> users = userRepository.findAll();
        return users.stream()
                .max(Comparator.comparing(User::getAge))
                .map(e -> userMapper.toDTO(e))
                .orElseThrow();
    }
}
