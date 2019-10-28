package com.pojo;

import java.io.Serializable;

public class Orders implements Serializable {
    private Integer oid;
    private String number;
    private Integer userid;

    //从表实体应该包含一个主表实体的对象引用
    private User user;

    @Override
    public String toString() {
        return "Orders [oid=" + oid + ", number=" + number + ", userid=" + userid + ", user=" + user + "]";
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}