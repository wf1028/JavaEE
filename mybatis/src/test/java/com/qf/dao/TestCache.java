package com.qf.dao;

import com.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;

public class TestCache {

    public void test1()throws Exception{
    InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
    //2.创建SqlSessionFactory工厂
    SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
    SqlSessionFactory factory = builder.build(in);
    SqlSession sqlSession1 = factory.openSession();
    UserDao dao1 = sqlSession1.getMapper(UserDao.class);
    User user1 = dao1.findByid2(12);
        System.out.println(user1);
        sqlSession1.close();//一级缓存消失

    SqlSession sqlSession2 = factory.openSession();
    UserDao dao2 = sqlSession2.getMapper(UserDao.class);
    User user2 = dao2.findByid2(12);
        System.out.println(user2);
        sqlSession2.close();
}
}