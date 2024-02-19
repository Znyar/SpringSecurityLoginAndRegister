package com.znyar.registrationlogin.service;

import com.znyar.registrationlogin.dto.UserDto;
import com.znyar.registrationlogin.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}
