package com.qf.service.impl;

import com.qf.dao.CustomerMapper;
import com.qf.entity.Customer;
import com.qf.entity.QueryVo;
import com.qf.service.CustomerService;
import com.qf.utils.Page;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

    @Resource(name = "customerMapper")
    private CustomerMapper customerMapper;

    @Override
    public Page<Customer> queryCustomerByQueryVo(QueryVo queryVo) {

        // 设置查询条件,从哪一条数据开始查
        queryVo.setStart((queryVo.getPage() - 1) * queryVo.getRows());

        // 查询数据结果集
        List<Customer> list = customerMapper.queryCustomerByQueryVo(queryVo);

        // 查询到的数据总条数
        Integer total = customerMapper.queryCountByQueryVo(queryVo);

        // 封装返回的page对象
        Page<Customer> customerPage = new Page<Customer>();
        //查询数据
        customerPage.setRows(list);
        //当前页
        customerPage.setPage(queryVo.getPage());
        //每页数据
        customerPage.setSize(queryVo.getRows());
        //总记录数
        customerPage.setTotal(total);

        return customerPage;
    }

    @Override
    public Customer queryCustomerById(Long id) {
        Customer customer = customerMapper.queryCustomerById(id);
        return customer;
    }

    @Override
    public void updateCustomerById(Customer customer) {
        customerMapper.updateCustomerById(customer);
    }

    @Override
    public void deleteCustomerById(Long id) {
        customerMapper.deleteCustomerById(id);
    }
}
