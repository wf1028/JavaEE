package com.yiguo.dao;

import com.yiguo.entity.Orders;
import com.yiguo.entity.OrdersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrdersMapper {
    //查看所有订单
     List<Orders> findAll();
     //查看付款类型订单
    //订单状态：未支付1、支付失败2、支付成功3、发货4、到货5、评价6
     List<Orders> findByStatus(String status);
    //添加订单
    int AddByOrders(Orders orders);
    //修改订单
    int  changeOrders(Orders orders);

}