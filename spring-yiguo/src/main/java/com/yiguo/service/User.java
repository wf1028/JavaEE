package com.yiguo.service;

import com.yiguo.dao.UserMapper;
import com.yiguo.entity.UserExample;

import java.util.List;

public class User implements UserService{
  private UserMapper userMapper;

    @Override
    public int countByExample(UserExample example) {
        return this.userMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(UserExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(com.yiguo.entity.User record) {
        return 0;
    }

    @Override
    public int insertSelective(com.yiguo.entity.User record) {
        return 0;
    }

    @Override
    public List<com.yiguo.entity.User> selectByExample(UserExample example) {
        return null;
    }

    @Override
    public com.yiguo.entity.User selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByExampleSelective(com.yiguo.entity.User record, UserExample example) {
        return 0;
    }

    @Override
    public int updateByExample(com.yiguo.entity.User record, UserExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(com.yiguo.entity.User record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(com.yiguo.entity.User record) {
        return 0;
    }
}