package org.example.eventprojectt.service;

import org.example.eventprojectt.dto.UserResponse;

public interface UserService {

    UserResponse findUserById(Long id);
}
