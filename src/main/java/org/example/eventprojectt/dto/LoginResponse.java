package org.example.eventprojectt.dto;

import lombok.Getter;
import lombok.Setter;
import org.example.eventprojectt.model.Role;

@Getter
@Setter
public class LoginResponse {

 private Long id;
 private String email;
 private Role role;
 private String massage;
//Giriş başarılı olunca kullanıcıya döneceğimiz cevabı hazırladık:
}
