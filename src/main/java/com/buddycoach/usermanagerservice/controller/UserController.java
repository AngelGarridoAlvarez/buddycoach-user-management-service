//Maneja las solicitudes HTTP y coordina las acciones entre servicio y cliente

package com.buddycoach.usermanagerservice.controller;

import com.buddycoach.usermanagerservice.model.User;
import com.buddycoach.usermanagerservice.service.UserService;
import java.sql.SQLException;
import java.util.List;

public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public User getUserById(Long id) throws SQLException {
        return userService.getUserById(id);
    }

    public List<User> getAllUsers() throws SQLException {
        return userService.getAllUsers();
    }
}
