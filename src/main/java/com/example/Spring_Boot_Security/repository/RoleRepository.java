package com.example.Spring_Boot_Security.repository;

import com.example.Spring_Boot_Security.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
