package com.example.simplespringsecurityjwtproject.app.service;

import com.example.simplespringsecurityjwtproject.app.domain.Role;
import com.example.simplespringsecurityjwtproject.app.domain.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);

    Role saveRole(Role role);

    void addRoleToUser(String username, String roleName);

    User getUser(String username);

    List<User> getUsers();
}
