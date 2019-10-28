package com.qf.dao;

import com.pojo.Role;

import java.util.List;

public interface RoleDao {
    //多表查询
    public List<Role> findAll();

}
