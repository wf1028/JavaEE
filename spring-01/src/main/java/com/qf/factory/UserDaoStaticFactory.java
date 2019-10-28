package com.qf.factory;

import com.qf.dao.UserDao;
import com.qf.dao.impl.UserDaoImpl;

public class UserDaoStaticFactory {
    public static UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
