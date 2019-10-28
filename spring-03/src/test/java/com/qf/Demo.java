package com.qf;

import com.qf.config.SpringConfigger;
import com.qf.controller.UserController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = "classpath:Bean.xml")//通过xml配置
@ContextConfiguration(classes = SpringConfigger.class)//通过类配置
public class Demo {
    @Autowired
private UserController userController;

    @Test
    public void test1(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
        UserController userController = (UserController)context.getBean("userController");
        System.out.println(userController);
        userController.test();
    }
    @Test
    public  void tesst2(){
        userController.test();
    }
}
