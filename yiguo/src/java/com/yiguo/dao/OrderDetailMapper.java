package com.yiguo.dao;

import com.yiguo.entity.OrderDetail;
import com.yiguo.entity.OrderDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderDetailMapper {
    //查找所有订单详情
    List<OrderDetail> findAll();
    //通过订单id查询订单详情
    OrderDetail findById(String id);
    //添加订单
    int AddByOrderDetail(OrderDetail orderDetail);
    //修改订单
    int  changeOrderDetail(OrderDetail orderDetail);


}