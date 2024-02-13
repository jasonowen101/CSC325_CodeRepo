package com.example.HR_AppJava.models;

import com.example.HR_AppJava.db.DbConnection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Users {
    // Variables
    private String userId;
    private String username;
    private String password;

    // Constructors (you may need to adjust these based on your requirements)
    public Users(String userId, String username, String password) {
        this.userId = userId;
        this.username = username;
        this.password = password;
    }

    public Users(String username, String password) {
        // Assuming userId is generated automatically (e.g., from a database sequence)
        this.userId = generateUserId();
        this.username = username;
        this.password = password;
    }

    // Getter methods
    public String getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    // Method to generate a unique user ID (you may need to implement this based on your requirements)
    private String generateUserId() {
        // Implementation of generating user ID (e.g., using UUID)
        // ...
        return generatedUserId;
    }

    // Method to insert a new user into the database
    public void create() {
        try {
            // Connect to the database
            Connection connection = DbConnection.getConnection();

            // Insert the user into the 'users' table
            DbConnection.insertUser(username, password, getEmail());

            // Close the database connection (optional, as the connection is static and may be reused)
            DbConnection.closeConnection();
        } catch (SQLException e) {
            System.err.println("Error creating user: " + e.getMessage());
        }
    }

    // Other methods (read, update, delete) can be implemented as needed
     //    - Methods
    //      - getUserId(): String
    //      - getUsername(): String
    //      - getPassword(): String
    //      - read(String userId): void
    //      - update(): void
    //      - delete(String userId): void

}

