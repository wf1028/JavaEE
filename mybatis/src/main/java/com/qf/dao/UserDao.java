package com.qf.dao;

import com.pojo.QueryVo;
import com.pojo.User;

import java.util.HashMap;
import java.util.List;

public interface UserDao {
    //查询所有
    public List<User> findAll();
    public User findByid2(Integer id);
    //添加
    public void add(User user);
    //修改
    public void updateById(User user);
    //删除
    public void deleteById(Integer id);
    //模糊查询
    public List<User> findFazzy(String username);
    public List<User> findFazzy2(String username);
    //查询总数据量
    public Integer getCount();
    //分页查询
    public List<User> PageSelect(HashMap hashMap);
   //通过集合查询多个
    public List<User> findBYIds(List<Integer> ids);
    //通过QueryVo对象查询多个
    public User findQueryVo(QueryVo queryvo);
   //通过QueryVo类对象查询
    public List<User> findBYIdsQueryVo(QueryVo queryvo);
    //多表查询每个用户的订单
    public  List<User> findUserOrder();
}
