package org.example.eventprojectt.service;

import org.example.eventprojectt.dto.LoginRequest;
import org.example.eventprojectt.dto.LoginResponse;
import org.example.eventprojectt.dto.UserCreateRequest;
import org.example.eventprojectt.dto.UserResponse;
import org.springframework.security.crypto.password.PasswordEncoder;

public interface UserService {

    UserResponse findUserById(Long id);

    UserResponse creteUser(UserCreateRequest request);

     LoginResponse login(LoginRequest request);

}
