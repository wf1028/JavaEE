package com.yiguo.entity;

import lombok.Data;

import java.util.Date;
@Data
public class Orders {
    private Integer id;
    private Integer uid;
    private Integer oid;
    private Double money;
    private String status;
    private Date time;
    private Integer aid;
    private Goods goods;
    private Address address;
    private User  user;
    private OrderDetail orderDetail;

}