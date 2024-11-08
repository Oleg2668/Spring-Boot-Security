package com.example.Spring_Boot_Security.repository;

import com.example.Spring_Boot_Security.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
