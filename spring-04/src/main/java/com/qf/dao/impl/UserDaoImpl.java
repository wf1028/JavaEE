package com.qf.dao.impl;

import com.qf.dao.UserDao;
import com.qf.entity.User;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class UserDaoImpl implements UserDao {
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    @Override
    public void addAccount(User account) {
        System.out.println("添加地址");
    }

    @Override
    public void deleteAccount(Integer Id) {

    }

    @Override
    public void updateAccount(User account) {

    }

    @Override
    public User findOne(Integer Id) {
        return null;
    }

    @Override
    public void add() {
        //int i=4/0;
        System.err.println("添加信息");
    }

    @Override
    public List<User> findAll() {
        return jdbcTemplate.query("select * from user",new BeanPropertyRowMapper<User>(User.class));
    }
}
