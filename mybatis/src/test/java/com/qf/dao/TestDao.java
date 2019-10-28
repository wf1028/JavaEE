package com.qf.dao;


import com.pojo.Orders;
import com.pojo.QueryVo;
import com.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TestDao {
    InputStream in=null;
    SqlSession session=null;
    SqlSession session2=null;


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

        List<User> users = userDao.findAll();
        for(User user : users){
            System.out.println(user);
        }
    }
    @Test
    public void add()throws Exception{
        UserDao userDao = session.getMapper(UserDao.class);
        User user=new User();
        user.setUsername("阿李");
        System.out.println(user.getUsername());
        userDao.add(user);
        session.commit();
    }
    @Test
    public void updateById()throws Exception{
        UserDao userDao = session.getMapper(UserDao.class);
        User user=new User();
        user.setUsername("dsfbsr");
        user.setId(2);
        System.out.println(user.getUsername());
        userDao.updateById(user);
        session.commit();
    }
    @Test
    public void delete(){
        UserDao userDao = session.getMapper(UserDao.class);
        User user=new User();
        userDao.deleteById(8);
        session.commit();
    }
    @Test
    public void selectFuzzy(){
        UserDao userDao = session.getMapper(UserDao.class);

        List<User> users=userDao.findFazzy("张三");
        System.out.println(users);

    }
    @Test
    public void selectFuzzy2(){
        UserDao userDao = session.getMapper(UserDao.class);
       String username="张三";
        List<User> users=userDao.findFazzy2("%"+username+"%");
        for(User user : users){
            System.out.println(user);
        }


    }
    @Test
    public void getCount(){
        UserDao userDao = session.getMapper(UserDao.class);
        Integer c=userDao.getCount();
        System.out.println(c);

    }
    @Test
    public void PageSelect(){
        UserDao userDao = session.getMapper(UserDao.class);
       HashMap<String,Integer>hashMap= new HashMap<>();
       hashMap.put("frist",0);
       hashMap.put("second",2);
       List<User> users=userDao.PageSelect(hashMap);
       for (User user:users){
           System.out.println(user);
       }

    }
    @Test
    public  void TestFind(){
        OrdersDao ordersDao = session.getMapper(OrdersDao.class);
        List<Orders> orders=ordersDao.findAll();
        System.out.println(orders);

    }
    @Test
    public  void findUserOrder() {
        UserDao userDao = session.getMapper(UserDao.class);
        List<User> userList = userDao.findUserOrder();
        for (User user : userList) {
            System.out.println(user);
        }


    }
    @Test
    public void QueryVo(){
        UserDao userDao = session.getMapper(UserDao.class);
        //5.使用代理对象执行方法
        User user=new User();
        user.setId(12);
        QueryVo queryvo=new QueryVo();
        queryvo.setUser(user);
        User dbuser=userDao.findQueryVo(queryvo);
        System.out.println(dbuser);
       }
       @Test
public void findIds(){
    UserDao userDao = session.getMapper(UserDao.class);
    //5.使用代理对象执行方法
    User user=new User();
    ArrayList<Integer> list=new ArrayList<Integer>();
    list.add(2);
    list.add(10);
    list.add(12);
    List<User> users = userDao.findBYIds(list);
    for(User user1 : users){
        System.out.println(user1);
    }
}
    @Test
    public void findBYIdsQueryVo() {
	  UserDao userDao = session.getMapper(UserDao.class);
	  QueryVo queryvo=new  QueryVo();
	  ArrayList<Integer> list=new ArrayList<Integer>();
	  list.add(2);
	  list.add(10);
	  list.add(12);
        System.out.println(list);
	  queryvo.setList(list);
	  List<User> users = userDao.findBYIdsQueryVo(queryvo);
	  for (User user:users) {
          System.out.println(user);
      }
	  }
	  @Test
	  public void findByid2()throws Exception{
          UserDao userDao = session.getMapper(UserDao.class);
          User user1=userDao.findByid2(11);
          System.out.println(user1);
          session.clearCache();


          //一级缓存
          User user2=userDao.findByid2(11);
          System.out.println(user1);
          System.out.println(user1==user2);

      }





    }






