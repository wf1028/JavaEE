package com;

import com.qf.entity.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    @Test
    public void test1(){
        ApplicationContext App= new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) App.getBean("user");
        System.out.println(user);
    }
}
