package com.jeor.hellossm.service;

import com.jeor.hellossm.entity.User;

import java.util.List;

public interface UserService {
    public List<User> find();
    public User get(Integer id);
}
