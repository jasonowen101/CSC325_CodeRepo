package com.example.HR_AppJava.controllers;

import com.example.HR_AppJava.models.User;
import com.example.HR_AppJava.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    // Endpoint to get all users
    @GetMapping("/all")
    public List<User> getAllUsers() {
        return userService.getUsers();
    }

    // Endpoint to get team members
    @GetMapping("/team-members")
    public List<User> getTeamMembers() {
        return userService.getTeamMates();
    }
}
