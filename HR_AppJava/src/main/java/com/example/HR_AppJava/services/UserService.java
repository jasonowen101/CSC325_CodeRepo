package com.example.HR_AppJava.services;

import com.example.HR_AppJava.models.User;

import java.util.List;

public interface UserService {
    List<User> getUsers();
    List<User> getTeamMates();
}
