//Contiene la lógica de negocio y coordina las operaciones entre el UserController y el UserRepository.

package com.buddycoach.usermanagerservice.service;

import com.buddycoach.usermanagerservice.model.User;
import com.buddycoach.usermanagerservice.repository.UserRepository;
import java.sql.SQLException;
import java.util.List;

public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUserById(Long id) throws SQLException {
        return userRepository.getUserById(id);
    }

    public List<User> getAllUsers() throws SQLException {
        return userRepository.getAllUsers();
    }
}
