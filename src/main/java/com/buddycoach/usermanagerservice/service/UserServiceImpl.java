package com.buddycoach.usermanagerservice.service;

import com.buddycoach.usermanagerservice.dto.UserRegisterDTO;
import com.buddycoach.usermanagerservice.model.Rol;
import com.buddycoach.usermanagerservice.model.User;
import com.buddycoach.usermanagerservice.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository UserRepository;

    public UserServiceImpl(com.buddycoach.usermanagerservice.repository.UserRepository userRepository) {
        super();
        UserRepository = userRepository;
    }

    @Override
    public User save(UserRegisterDTO registroDTO) {
        User user = new User(registroDTO.getNombre(), registroDTO.getApellido(), registroDTO.getEmail(), registroDTO.getPassword(), Arrays.asList(new Rol("ROLE_USER")));
        return UserRepository.save(user);
    }
}
