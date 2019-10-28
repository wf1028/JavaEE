package com.qf.service;

import com.qf.entity.Customer;
import com.qf.entity.QueryVo;
import com.qf.utils.Page;

public interface CustomerService {

    /**
     * 分页查询
     */
    public Page<Customer> queryCustomerByQueryVo(QueryVo queryVo);

    /**
     * 根据id查询数据
     */
    Customer queryCustomerById(Long id);


    /**
     * 根据id编辑客户数据
     */
    void updateCustomerById(Customer customer);


    /**
     * 根据id删除客户
     */
    void deleteCustomerById(Long id);

}
