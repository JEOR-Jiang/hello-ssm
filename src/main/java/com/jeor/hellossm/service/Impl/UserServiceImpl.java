package com.jeor.hellossm.service.Impl;

import com.jeor.hellossm.controller.UserController;
import com.jeor.hellossm.entity.User;
import com.jeor.hellossm.mapper.UserMapper;

import com.jeor.hellossm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    public List<User> find() {
        return userMapper.find();
    }
    public User get(Integer id){
        return userMapper.get(id);
    }

}
