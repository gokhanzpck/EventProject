package org.example.eventprojectt.controller.impl;

import org.example.eventprojectt.controller.UserController;
import org.example.eventprojectt.dto.LoginRequest;
import org.example.eventprojectt.dto.LoginResponse;
import org.example.eventprojectt.dto.UserCreateRequest;
import org.example.eventprojectt.dto.UserResponse;
import org.example.eventprojectt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserControllerImpl implements UserController {

    @Autowired
    private UserService userService;
    @Override
    @GetMapping("/{id}")
    public UserResponse findUserById(@PathVariable Long id) {
    return userService.findUserById(id);
        }

    @Override
    @PostMapping("/register")
    public ResponseEntity<UserResponse> createUser(@RequestBody UserCreateRequest request) {

        UserResponse response = userService.creteUser(request);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(response);

    }

    @Override
    @PostMapping("/login")
    public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest request) {
   LoginResponse response= userService.login(request);
   return ResponseEntity.ok(response);


    }

}
