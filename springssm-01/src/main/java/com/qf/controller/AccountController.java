package com.qf.controller;

import com.qf.entity.Account;
import com.qf.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller("accountController")
@RequestMapping("/account")
public class AccountController {

   @Autowired
    private AccountService accountService;

   @RequestMapping(value = "/findAll")
    public String findAll(Model model){
        System.out.println("表现层：查询所有账户...");
        // 调用service的方法
        List<Account> list = accountService.findAll();
        model.addAttribute("list",list);
        return "/list.jsp";
    }
    @RequestMapping("/test")
    public void test(){
        System.out.println("测试web层");
        //List<Account> all = accountService.findAll();
        //System.out.println(all);
        return ;
    }




    //保存
   @RequestMapping("/save")
    public void save(Account account, HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("跳转");
        accountService.saveAccount(account);
        response.sendRedirect(request.getContextPath()+"/account/findAll");
        return;
    }

}
