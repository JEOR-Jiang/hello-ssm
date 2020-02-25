package com.jeor.hellossm.controller;

import com.jeor.hellossm.entity.User;
import com.jeor.hellossm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String ok(){
        return "ok";
    }

    @RequestMapping("/find")
    public List<User> find(){
        return userService.find();
    }

    @RequestMapping("/get/{id}")
    public User get(@PathVariable Integer id){
        return userService.get(id);
    }

}
