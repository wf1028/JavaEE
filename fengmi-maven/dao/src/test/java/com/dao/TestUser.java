package com.dao;

import com.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class TestUser {
    InputStream in=null;
    SqlSession session=null;


    @Before
    public void begin()throws Exception{
        in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2.创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        //3.使用工厂生产SqlSession对象
        session = factory.openSession();
        //4.使用SqlSession创建Dao接口的代理对象
        UserDao userDao = session.getMapper(UserDao.class);
        //5.使用代理对象执行方法
    }
    @After
    public void ending()throws Exception{
        session.close();
        in.close();
    }
    @Test
    public void findAll(){
        UserDao userDao = session.getMapper(UserDao.class);

        List<User> users = userDao.userSelect();
        for(User user : users){
            System.out.println(user);
        }
    }
}
