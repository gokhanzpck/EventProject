package org.example.eventprojectt.controller.impl;

import org.example.eventprojectt.controller.UserController;
import org.example.eventprojectt.dto.UserResponse;
import org.example.eventprojectt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
