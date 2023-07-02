package com.buddycoach.usermanagerservice.service;

import com.buddycoach.usermanagerservice.dto.UserRegisterDTO;
import com.buddycoach.usermanagerservice.model.User;

public interface UserService {
    public User save(UserRegisterDTO registroDTO);
}
