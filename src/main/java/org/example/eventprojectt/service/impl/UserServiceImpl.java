package org.example.eventprojectt.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.eventprojectt.dto.*;
import org.example.eventprojectt.model.Role;
import org.example.eventprojectt.model.User;
import org.example.eventprojectt.repository.UserRepository;
import org.example.eventprojectt.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private  final PasswordEncoder passwordEncoder;

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserResponse findUserById(Long id) {

       UserResponse userCreteRequest=new UserResponse();
        EventResponse eventCreateRequest=new EventResponse();

        Optional<User> optional=userRepository.findById(id);
        if (optional.isEmpty()){
            return null;
        }
        User user=optional.get();
        BeanUtils.copyProperties(user,userCreteRequest);

        return userCreteRequest;
    }

    @Override
    public UserResponse creteUser(UserCreateRequest request) {

        if (userRepository.findByEmail(request.getEmail()).isPresent()){
            throw new RuntimeException("Bu Email zaten kayıtlı!!!");
        }
        //ispresenet==bir değerin veya öğenin mevcut olup olmadığını kontrol etmek için kullanılan bir fonksiyondur.
          //email iki tane kayıt olmasına izin vermez



      User user=new User();
      user.setEmail(request.getEmail());
      user.setPassword(passwordEncoder.encode(request.getPassword()));
      user.setRole(Role.valueOf(request.getRole().toUpperCase()));

       User savedUser=userRepository.save(user);

       return  new UserResponse(
               savedUser.getId(),
               savedUser.getEmail(),
               savedUser.getRole()
       );
    }

    @Override
    public LoginResponse login(LoginRequest request) {

        User user=userRepository.findByEmail(request.getEmail())
                .orElseThrow(()->
                        new RuntimeException("Email veya şifre hatalı"));
     boolean passwordMatches =passwordEncoder.matches(
             request.getPassword(),
             user.getPassword()
     );
     if (!passwordMatches){
         throw new RuntimeException("Email veya şifre hatalı ");
     }
     LoginResponse response=new LoginResponse();

     response.setId(user.getId());
     response.setEmail(user.getEmail());
     response.setRole(user.getRole());
     response.setMassage("giriş başarılı");
     return response;

    }
}
