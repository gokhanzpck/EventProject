package org.example.eventprojectt.service.impl;

import org.example.eventprojectt.dto.EventResponse;
import org.example.eventprojectt.dto.UserResponse;
import org.example.eventprojectt.model.User;
import org.example.eventprojectt.repository.UserRepository;
import org.example.eventprojectt.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
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
}
