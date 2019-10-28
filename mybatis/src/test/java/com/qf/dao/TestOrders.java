package com.qf.dao;

import com.pojo.Orders;
import com.pojo.Role;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class TestOrders {
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
        OrdersDao ordersDao = session.getMapper(OrdersDao .class);

        List<Orders> orders = ordersDao.findAll2();
        System.out.println(orders.size());
        System.out.println(orders.get(2).getUser());
       /* for(Orders order : orders){
            System.out.println(order);
        }*/
    }
}
