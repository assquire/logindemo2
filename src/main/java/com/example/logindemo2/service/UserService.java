package com.example.logindemo2.service;

import com.example.logindemo2.model.User;
import com.example.logindemo2.model.Role;

import java.util.List;

public interface UserService {

    User saveUser(User user);

    Role saveRole(Role role);

    void addRoleToUser(String username, String roleName);

    User getUser(String username);

    List<User> getUsers();

}
