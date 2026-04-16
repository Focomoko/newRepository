package com.example.spring.service;

import com.example.spring.DTO.UserRequestDTO;
import com.example.spring.entity.User;
import com.example.spring.mapper.UserMapper;
import com.example.spring.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public void save(UserRequestDTO userDTO) {
        User user = userMapper.toUser(userDTO);
        userRepository.save(user);
        
    }
}
