package org.example.eventprojectt.controller;

import org.example.eventprojectt.dto.UserResponse;

public interface UserController {

    public UserResponse findUserById(Long id);
}
