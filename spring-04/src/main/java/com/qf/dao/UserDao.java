package com.qf.dao;

import com.qf.entity.User;

import java.util.List;

public interface UserDao {
    void addAccount(User account);

    void deleteAccount(Integer Id);

    void updateAccount(User account);

    User findOne(Integer Id);
   void add();
    List<User> findAll();}

