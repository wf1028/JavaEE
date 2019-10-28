package com.qf.controller;

import com.qf.entity.Account;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/*@Controller("accountController")
@RequestMapping("/5555account")*/
public class Test {
   // @RequestMapping("/test")
    public String test(){
        System.out.println("测试web层");
        return "/success.jsp";
    }
}
