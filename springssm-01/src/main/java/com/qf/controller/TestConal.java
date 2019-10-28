package com.qf.controller;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/map")
public class TestConal {

    @RequestMapping("/test")
    public void test(){
        System.out.println("测试");
    }

}
