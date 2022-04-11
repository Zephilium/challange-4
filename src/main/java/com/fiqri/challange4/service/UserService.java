package com.fiqri.challange4.service;

import com.fiqri.challange4.entity.User;

public interface UserService {
    User addUser(User user);

    void updateUser(User user);

    void deleteUser(String username);
}
