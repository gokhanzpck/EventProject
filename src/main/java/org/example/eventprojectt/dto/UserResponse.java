package org.example.eventprojectt.dto;

import lombok.Getter;
import lombok.Setter;
import org.example.eventprojectt.model.Role;

@Getter
@Setter
public class UserResponse {
private String email;
private  String password;
private Role role;
}
