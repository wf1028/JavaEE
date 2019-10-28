package com.yiguo.entity;

import lombok.Data;

@Data
public class OrderDetail {
    private Integer id;

    private Integer pid;
    private Integer uid;

    private Integer oid;

    private Integer num;

    private Double money;

    private Integer aid;

    private String leaveMessage;

    private Goods goods;

    private Address address;

    @Override
    public String toString() {
        return "OrderDetail{" +
                "id=" + id +
                ", pid=" + pid +
                ", oid=" + oid +
                ", num=" + num +
                ", money=" + money +
                ", aid=" + aid +
                ", leaveMessage='" + leaveMessage + '\'' +
                ", goods=" + goods +
                ", address=" + address +
                '}';
    }
}