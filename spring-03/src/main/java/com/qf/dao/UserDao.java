package com.qf.dao;

import com.qf.entity.User.User;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Repository
public interface UserDao {
    public void login();
    public void add();
    public void delete();

}
