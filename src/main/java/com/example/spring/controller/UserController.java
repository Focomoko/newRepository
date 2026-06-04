package com.example.spring.controller;

import com.example.spring.DTO.UserRequestDTO;
import com.example.spring.DTO.response.UserResponseDTO;
import com.example.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public UserResponseDTO findById(@RequestParam("id") Long id) {
        return userService.findById(id);
    }

    @GetMapping("/findAll")
    public List<UserResponseDTO> findAll() {
        return userService.findAll();
    }

    @DeleteMapping("/delete")
    public UserResponseDTO deleteById(@RequestParam("id") Long id) {
        return userService.deleteById(id);
    }

    @GetMapping("/getAllSumAge")
    public int getAllAgeSum() {
        return userService.getAllAgeSum();
    }

    @GetMapping("/getMaxAge")
    public UserResponseDTO getMaxAge() {
        return userService.getMaxAge();
    }

    @GetMapping("/findByIdRange")
    public List<UserResponseDTO> findByIdRange(@RequestParam("min") Long min, @RequestParam("max") Long max) {
        return userService.findByIdRange(min, max);
    }

    @GetMapping("getRangeAge")
    public int getRangeAge(@RequestParam("min") Long min, @RequestParam("max") Long max) {
        return userService.getRangeAge(min, max);
    }

    @DeleteMapping("/deleted")
    public UserResponseDTO softDeleted(@RequestParam("id") Long id) {
        return userService.softDeleted(id);
    }

    @GetMapping("/totalAge")
    public int totalAge() {
        return userService.getTotalAgeDeleted();
    }

    @GetMapping("/getXudoy")
    public UserResponseDTO xudoyKot() {
        return userService.getMaxAge();
    }
    @GetMapping("/getXudoy2")
    public UserResponseDTO xudoyKot2() {
        return userService.getMaxAge();
    }

}
