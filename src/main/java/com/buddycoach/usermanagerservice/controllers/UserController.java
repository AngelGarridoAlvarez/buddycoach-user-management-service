package com.buddycoach.usermanagerservice.controllers;

import com.buddycoach.usermanagerservice.dto.UserDTO;
import com.buddycoach.usermanagerservice.dto.LoginDTO;
import com.buddycoach.usermanagerservice.services.UserService;
import com.buddycoach.usermanagerservice.payload.response.LoginMesage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(path = "/register")
    public String registerUser(@RequestBody UserDTO userDTO) {
        String username = userService.addUser(userDTO);
        return username;
    }

    @PostMapping(path = "/login")
    public ResponseEntity<?> loginUser(@RequestBody LoginDTO loginDTO) {
        LoginMesage loginMessage = userService.loginUser(loginDTO);
        return ResponseEntity.ok(loginMessage);
    }
}
