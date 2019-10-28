package com.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;
@Data
public class Role implements Serializable {

    private Integer rid;
    private String rolename;

    //多对多的关系映射：一个角色可以赋予多个用户
    private List<User> users;

    @Override
    public String toString() {
        return "Role{" +
                "rid=" + rid +
                ", rolename='" + rolename + '\'' +
                ", users=" + users +
                '}';
    }
}
