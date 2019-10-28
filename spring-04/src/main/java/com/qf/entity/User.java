package com.qf.entity;

import lombok.Data;

@Data
public class User {
    private Integer userid;
    private String loginname;
    private String loginpwd;

    public User(Integer userid, String loginname, String loginpwd) {
        this.userid = userid;
        this.loginname = loginname;
        this.loginpwd = loginpwd;
    }

    public User() {
    }
}
