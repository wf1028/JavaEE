package com.qf.controller;

import com.qf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    @Autowired
    private UserService userService;


    public void test(){
        System.out.println("进行增删改");
        userService.delete();
     /*  List<User> select = userService.select();
        for (User user:select){
        System.out.println(user.getLoginname());
    }*/}

}
