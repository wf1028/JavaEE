package com.qf.dao.impl;

import com.qf.dao.UserDao;

public class UserDaoImpl implements UserDao {
    @Override
    public boolean login() {
        System.out.println("登陆");
        return true;
    }
    public void init(){
        System.out.println("开启bean");
    }
    public  void destory(){
        System.out.println("关闭bean");
    }
}
