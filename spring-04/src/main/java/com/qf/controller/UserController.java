package com.qf.controller;

import com.qf.entity.User;
import com.qf.service.UserService;

import java.util.List;

public class UserController {
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
    public List<User> test(){
        return userService.findAll();
    }
}
