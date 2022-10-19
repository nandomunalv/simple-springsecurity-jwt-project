package com.example.simplespringsecurityjwtproject.app.repository;

import com.example.simplespringsecurityjwtproject.app.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
