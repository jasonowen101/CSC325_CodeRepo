package com.example.HR_AppJava.services;

import com.example.HR_AppJava.models.User;
import com.example.HR_AppJava.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public List<User> getTeamMates() {
        // To do later: Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTeamMates'");
    }
}
