package com.learn.service.impl;

import com.learn.mapper.UserMapper;
import com.learn.pojo.User;
import com.learn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public void addUser(User user){
        this.userMapper.insertUser(user);
    }
}
