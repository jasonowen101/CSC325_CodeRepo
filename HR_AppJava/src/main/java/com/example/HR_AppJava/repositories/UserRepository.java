package com.example.HR_AppJava.repositories;

import com.example.HR_AppJava.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    // Custom query to get team mates
    @Query("SELECT u FROM User u WHERE u.team = ?1")
    List<User> findTeamMates(String team);
}
