package org.example.eventprojectt.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Getter
@Setter
public class UserCreateRequest {
private String email;
private String password;
private String role;
}
