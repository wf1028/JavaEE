package com.qf.entity;

import lombok.Data;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Data
public class User {
    private String username;
    private String password;
    private Car car;
    private Date date;
    private List<Car> list;
    private Map<String,Car> map;

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", car=" + car +
                ", date=" + date +
                ", list=" + list +
                ", map=" + map +
                '}';
    }
}
