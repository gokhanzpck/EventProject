package org.example.eventprojectt.controller;

import org.example.eventprojectt.dto.LoginRequest;
import org.example.eventprojectt.dto.LoginResponse;
import org.example.eventprojectt.dto.UserCreateRequest;
import org.example.eventprojectt.dto.UserResponse;
import org.springframework.http.ResponseEntity;

public interface UserController {

    public UserResponse findUserById(Long id);

       public ResponseEntity<UserResponse> createUser(UserCreateRequest request);

       public ResponseEntity<LoginResponse> login(LoginRequest request);


}
