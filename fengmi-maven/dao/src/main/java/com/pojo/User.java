package com.pojo;

import lombok.Data;

import java.io.Serializable;
@Data
public class User implements Serializable {
    private int id;
    private String username;
    private String password;
    private String phone;
    private String mail;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }
}
