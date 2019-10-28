package com.dao;

import com.pojo.User;

import java.util.List;

public interface UserDao {
    public List<User> userSelect();
    public List<User> userSelectByName(String username, String sex);
    public int userDeleteById(int id);
    public int userAdd(User user);
    //通过字段模糊查询
    public List<User> fuzzySelectUser(int pageNo, int pageSize, String condition);
    public int UserfuzzyDateCount(String condition);
    public int UserIdupdate(String password,int id);
}
