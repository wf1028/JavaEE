package com.qf.service.impl;

import com.qf.dao.UserDao;
import com.qf.entity.User.User;
import com.qf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public void login() {

     userDao.login();
    }

    @Override
    public void add() {
     userDao.add();
    }

    @Override
    public void delete() {
        userDao.delete();

    }


}
