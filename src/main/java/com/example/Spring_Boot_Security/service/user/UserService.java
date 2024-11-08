package com.example.Spring_Boot_Security.service.user;

import com.example.Spring_Boot_Security.dto.UserDto;
import com.example.Spring_Boot_Security.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);
    User findByEmail(String email);
    List<UserDto> findAllUsers();
}
