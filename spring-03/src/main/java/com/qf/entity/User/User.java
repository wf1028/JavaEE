package com.qf.entity.User;

import lombok.Data;

@Data
public class User {
    private String loginname;
    private String loginpwd;
    private Integer userid;

    @Override
    public String
    toString() {
        return "User{" +
                "loginname='" + loginname + '\'' +
                ", loginpwd='" + loginpwd + '\'' +
                ", userid=" + userid +
                '}';
    }
}
