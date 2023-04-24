package com.authentication.service;

import com.authentication.model.entity.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    User findByUsername(String username);

    User save(User user);

    Boolean notExistEmail(String email);
}