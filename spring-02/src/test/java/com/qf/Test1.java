package com.qf;

import com.qf.dao.impl.UserDaoImpl;
import com.qf.entity.CollectionDemo;
import com.qf.controller.Collcetion;
import com.qf.controller.UserController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    @Test
    public void test1(){
        UserController controller = new UserController();
         controller.Login();
//        UserServiceImpl userService = new UserServiceImpl();
//        userService.Login();
    }

    @Test
    public void test2(){

        ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");

        UserDaoImpl userDaoImpl = (UserDaoImpl)context.getBean("userDao");

        System.out.println(userDaoImpl);

        userDaoImpl.Login();
    }
    @Test
    public void test3(){

        ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");

        UserController userController = (UserController)context.getBean("userController");

        //System.out.println(userController);

        userController.Login();
    }
    @Test
    public void test4(){

        ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");

        CollectionDemo coll = (CollectionDemo)context.getBean("coll");

        //System.out.println(userController);
        System.out.println(coll);
    }
    @Test
    public void test5(){

        ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");

        Collcetion coll = (Collcetion)context.getBean("collcetion");

        //System.out.println(userController);
        System.out.println(coll);
        coll.test();
    }
    @Test
    public void test6(){

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");

        Collcetion coll = (Collcetion)context.getBean("collcetion");
        Collcetion coll2 = (Collcetion)context.getBean("collcetion");
        //System.out.println(userController);
        System.out.println(coll==coll2);
        coll.test();
        context.close();
    }

}
