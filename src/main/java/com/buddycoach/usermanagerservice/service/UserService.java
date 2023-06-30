package com.buddycoach.usermanagerservice.service;

import com.buddycoach.usermanagerservice.model.User;
import com.buddycoach.usermanagerservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User registerUser(User user) {
        // Implement registration logic here
    }

    public User loginUser(String email, String password) {
        // Implement login logic here
    }

    public User updateUser(User user) {
        // Implement update logic here
    }

    public void deleteUser(Long userId) {
        // Implement delete logic here
        userRepository.deleteById(userId);
    }

    public Optional<User> getUserById(Long userId) {
        return userRepository.findById(userId);
    }
}

