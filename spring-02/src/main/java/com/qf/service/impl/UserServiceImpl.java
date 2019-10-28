package com.qf.service.impl;

import com.qf.dao.UserDao;
import com.qf.dao.impl.UserDaoImpl;
import com.qf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

   // private UserDao userDao = new UserDaoImpl();
   @Autowired
   private UserDao userDao;



    @Override
    public void Login() {
        System.out.println("可以调用" );
    userDao.Login();
    }
}
