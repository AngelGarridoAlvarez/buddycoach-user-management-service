package com.buddycoach.usermanagerservice.repository;

import com.buddycoach.usermanagerservice.model.User;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

//Interactua con la BBDD y realiza operaciones CRUD sobre User

public class UserRepository {

    private Connection connection;

    // ToDo configurar la conexión en el constructor.
    public UserRepository(Connection connection) {
        this.connection = connection;
    }

    public User getUserById(Long id) throws SQLException {
        String query = "SELECT * FROM users WHERE id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setLong(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            return new User(
                    resultSet.getLong("id"),
                    resultSet.getString("name"),
                    resultSet.getString("email"),
                    resultSet.getString("password"),
                    resultSet.getDate("date_of_birth"),
                    resultSet.getString("roles"),
                    resultSet.getBoolean("enabled")
            );
        }
        return null;
    }

    public List<User> getAllUsers() throws SQLException {
        List<User> users = new ArrayList<>();
        String query = "SELECT * FROM users";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        while (resultSet.next()) {
            users.add(new User(
                    resultSet.getLong("id"),
                    resultSet.getString("name"),
                    resultSet.getString("email"),
                    resultSet.getString("password"),
                    resultSet.getDate("date_of_birth"),
                    resultSet.getString("roles"),
                    resultSet.getBoolean("enabled")
            ));
        }
        return users;
    }
}