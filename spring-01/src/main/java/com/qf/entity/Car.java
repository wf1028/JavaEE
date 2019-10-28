package com.qf.entity;

import lombok.Data;

@Data
public class Car {
    private String cname;

    @Override
    public String toString() {
        return "Car{" +
                "cname='" + cname + '\'' +
                '}';
    }
}
