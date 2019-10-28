package com.qf.entity;

import lombok.Data;

@Data
public class QueryVo {
    private String custName;
    private String custSource;
    private String custIndustry;
    private String custLevel;

    // 当前页码数
    private Integer page = 1;
    // 数据库从哪一条数据开始查
    private Integer start;
    // 每页显示数据条数
    private Integer rows = 5;
}
