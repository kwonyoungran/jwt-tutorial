package com.example.jwtTutorial.repository;

import com.example.jwtTutorial.entity.User;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    @EntityGraph(attributePaths = "autorities")
    Optional<User> findOneWithAuthoritiesByUsername(String username);
}
