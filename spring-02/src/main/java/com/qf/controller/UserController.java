package com.qf.controller;

import com.qf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
//@Component
public class UserController {

    @Autowired
    private UserService userService;

    public void Login(){
        System.out.println("web层调用");
        userService.Login();

    }
}
