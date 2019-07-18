package com.learn.service;

import com.learn.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserService {
    void addUser(User user);
}
