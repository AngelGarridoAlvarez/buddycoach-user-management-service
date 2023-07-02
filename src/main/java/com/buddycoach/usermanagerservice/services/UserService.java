package com.buddycoach.usermanagerservice.services;

import com.buddycoach.usermanagerservice.dto.LoginDTO;
import com.buddycoach.usermanagerservice.dto.UserDTO;
import com.buddycoach.usermanagerservice.payload.response.LoginMesage;

public interface UserService {
    String addUser(UserDTO userDTO);
    LoginMesage loginUser(LoginDTO loginDTO);
}
