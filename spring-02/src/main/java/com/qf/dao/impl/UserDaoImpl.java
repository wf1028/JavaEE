package com.qf.dao.impl;

import com.qf.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository("userDao" )
public class UserDaoImpl implements UserDao {
    @Override
    public void Login() {
        System.out.println("登陆---");
    }
}
