package com.example.spring.controller;

import com.example.spring.DTO.UserRequestDTO;
import com.example.spring.DTO.response.UserResponseDTO;
import com.example.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/save")
    public UserResponseDTO save(@RequestBody UserRequestDTO userRequestDTO) {
        return userService.save(userRequestDTO);
    }
    @GetMapping("/findId")
    public UserResponseDTO findById(@RequestParam ("id") Long id) {
        return userService.findById(id);
    }
}
