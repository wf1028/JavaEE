package com.qf.factory;

import com.qf.dao.UserDao;
import com.qf.dao.impl.UserDaoImpl;

public class UserDaoFactory {
    public UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
