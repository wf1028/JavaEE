package com.qf.entity;

import lombok.Data;

@Data
public class User {
    private Integer id;
    private String name;
    private Car car;

    public User(Integer id, String name, Car car) {
        this.id = id;
        this.name = name;
        this.car = car;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", car=" + car +
                '}';
    }
}
