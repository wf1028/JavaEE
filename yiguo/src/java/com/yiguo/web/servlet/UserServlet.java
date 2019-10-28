package com.yiguo.web.servlet;


import com.yiguo.dao.UserMapper;
import com.yiguo.entity.User;
import com.yiguo.entity.UserExample;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@WebServlet("/user/*")
public class UserServlet extends BaseServlet {
    private InputStream in=null;
    private UserMapper userMapper=null;
    private SqlSession session=null;
    SqlSessionFactory factory=null;
    public UserMapper begin()throws Exception{
        in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2、创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        factory = builder.build(in);
        //3、使用SqlSessionFactory工厂生产SqlSession对象
        session = factory.openSession();
        //4、使用SqlSession创建Dao接口的代理对象
        userMapper = session.getMapper(UserMapper.class);
      return userMapper;
    }
    UserMapper begin;
    {
        try {
            begin = begin();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void findAll(HttpServletRequest req, HttpServletResponse resp) throws ServletException,Exception {
        List<User> users = begin.selectByExample(new UserExample());
        System.out.println(users);
        writeValue(users,resp);
        session.commit();
        //6、关闭资源
        session.close();
        in.close();
    }

    public void findById(HttpServletRequest req, HttpServletResponse resp){

    }
}
