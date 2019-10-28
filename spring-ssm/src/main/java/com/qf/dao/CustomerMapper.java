package com.qf.dao;

import com.qf.entity.Customer;
import com.qf.entity.QueryVo;

import java.util.List;

public interface CustomerMapper {

    //分頁查詢
    List<Customer> queryCustomerByQueryVo(QueryVo queryVo);

    //查询总记录数
    Integer queryCountByQueryVo(QueryVo queryVo);


    //根据id查询客户
    Customer queryCustomerById(Long id);

    //根据id编辑客户
    void updateCustomerById(Customer customer);


    //根据id删除用户
    void deleteCustomerById(Long id);

}