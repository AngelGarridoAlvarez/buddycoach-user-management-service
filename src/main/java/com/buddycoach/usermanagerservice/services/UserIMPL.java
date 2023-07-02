package com.buddycoach.usermanagerservice.services;

import com.buddycoach.usermanagerservice.dto.UserDTO;
import com.buddycoach.usermanagerservice.dto.LoginDTO;
import com.buddycoach.usermanagerservice.models.User;
import com.buddycoach.usermanagerservice.repositories.UserRepo;
import com.buddycoach.usermanagerservice.services.UserService;
import com.buddycoach.usermanagerservice.payload.response.LoginMesage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;
import jakarta.annotation.Resource;

@Service
public class UserIMPL implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public String addUser(UserDTO userDTO) {

        User user = new User(
                userDTO.getUserid(),
                userDTO.getUsername(),
                userDTO.getEmail(),
                this.passwordEncoder.encode(userDTO.getPassword())
        );

        userRepo.save(user);

        return user.getUsername();
    }
    UserDTO userDTO;

    @Override
    public LoginMesage loginUser(LoginDTO loginDTO) {
        String msg = "";
        User user1 = userRepo.findByEmail(loginDTO.getEmail());
        if (user1 != null) {
            String password = loginDTO.getPassword();
            String encodedPassword = user1.getPassword();
            Boolean isPwdRight = passwordEncoder.matches(password, encodedPassword);
            if (isPwdRight) {
                Optional<User> retrievedUser = userRepo.findOneByEmailAndPassword(loginDTO.getEmail(), encodedPassword);
                if (retrievedUser.isPresent()) {
                    return new LoginMesage("Login Success", true);
                } else {
                    return new LoginMesage("Login Failed", false);
                }
            } else {
                return new LoginMesage("Password Not Match", false);
            }
        } else {
            return new LoginMesage("Email not exists", false);
        }
    }
}