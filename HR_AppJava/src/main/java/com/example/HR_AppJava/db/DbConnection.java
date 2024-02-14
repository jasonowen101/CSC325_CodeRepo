package com.example.HR_AppJava.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DbConnection {
    // JDBC URL of SQLite database
    private static final String JDBC_URL = "jdbc:sqlite:/HR_AppJava/src/main/java/com/example/HR_AppJava/db/HR_Dbase.db";

    // JDBC variable for opening, closing, and managing connection
    private static Connection connection;

    static {
        try {
            // Establish a connection
            connection = DriverManager.getConnection(JDBC_URL);
            System.out.println("Connected to SQLite database");
        } catch (SQLException e) {
            System.err.println("Error connecting to SQLite database: " + e.getMessage());
        }
    }

    // Function to get the database connection
    public static Connection getConnection() {
        return connection;
    }

    // Close the database connection when the application exits
    public static void closeConnection() {
        try {
            if (connection != null) {
                connection.close();
                System.out.println("SQLite connection closed");
            }
        } catch (SQLException e) {
            System.err.println("Error closing SQLite connection: " + e.getMessage());
        }
    }

    // Function to insert a user into the 'users' table
    public static void insertUser(String username, String password, String userId) {
        try {
            String query = "INSERT INTO users (username, password, userId) VALUES (?, ?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setString(1, username);
                preparedStatement.setString(2, password);
                preparedStatement.setString(3, userId);

                int rowsAffected = preparedStatement.executeUpdate();

                if (rowsAffected > 0) {
                    System.out.println("User inserted successfully");
                } else {
                    System.out.println("Failed to insert user");
                }
            }
        } catch (SQLException e) {
            System.err.println("Error inserting user: " + e.getMessage());
        }
    }
}

