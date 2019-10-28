package com.qf.dao;

import com.pojo.Orders;

import java.util.List;

public interface OrdersDao {
    public List<Orders> findAll();
    public List<Orders> findAll2();

}
