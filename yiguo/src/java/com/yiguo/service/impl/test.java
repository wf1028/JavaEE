package com.yiguo.service.impl;

import com.yiguo.entity.UserExample;
import com.yiguo.service.User;
import com.yiguo.service.UserService;

public class test {
    public static void main(String[] args) {
        User user = new User();
        UserExample userExample = new UserExample();
        int i = user.countByExample(userExample);
        System.out.println(i);
    }
}
