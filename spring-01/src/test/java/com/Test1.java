package com;

import com.qf.dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

    @Test
    public void Test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao=(UserDao)context.getBean("userDao");
        System.out.println(userDao.login());

    }
    @Test
    public void Test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao=(UserDao)context.getBean("userDao");
        UserDao userDao2=(UserDao)context.getBean("userDao");
        System.out.println(userDao.login());
        System.out.println(userDao==userDao2);

    }
    @Test
    public void Test3(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao=(UserDao)context.getBean("userDao");
        UserDao userDao2=(UserDao)context.getBean("userDao");
        System.out.println(userDao.login());
        System.out.println(userDao==userDao2);
        context.close();

    }
}
