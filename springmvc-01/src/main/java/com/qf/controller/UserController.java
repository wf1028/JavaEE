package com.qf.controller;

import com.qf.entity.User;
import com.qf.exception.MyException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;

@Controller
    @RequestMapping("/user")
    public class UserController {

        @RequestMapping(path = "login",method = RequestMethod.GET,params = {"id"},headers = "host")
        public String Login(){

            System.out.println("login...");

            return "/success.jsp";
        }
   @RequestMapping(path = "testParm",method = RequestMethod.POST)
    public String testParm(String username,String password){

        System.out.println("login...");
       System.out.println(username);
       System.out.println(password);
        return "/success.jsp";
    }

    @RequestMapping(path = "testFarm" )
    public String testFarm(User user){

        System.out.println("login...");
        System.out.println(user);
        return "/success.jsp";
    }

    @RequestMapping(path = "testBean" )
    public String testBean(User user){

        System.out.println("login...");
        System.out.println(user);

        return "/success.jsp";
    }
    @RequestMapping(value="testPathVariable")
    public String testPathVariable(@RequestParam(name="userId") String id){
        System.out.println(id);
        return "/success.jsp";
    }

    @RequestMapping(path = "testRequestBody")
    public String testRequestBody(@RequestBody String body){

        System.out.println("login...");
        System.out.println(body);

        return "/success.jsp";
    }
    @RequestMapping(value="/testException")
    public void testException() throws MyException {

        System.out.println(1/0);
        throw new MyException("自定义异常");
    }
    @RequestMapping("/testInterceptor")
    public String testInterceptor(){
        System.out.println("testInterceptor执行了...");
        return "/success.jsp";
    }



    @RequestMapping(path = "testResponseBody")
    @ResponseBody
    public String testResponseBody(String body){

        System.out.println("login...");
        System.out.println(body);

        return "/success.jsp";
    }
    @RequestMapping(path = "testResponseBody2")
    @ResponseBody
    public void testResponseBody2(HttpServletResponse response)throws Exception{
    response.getWriter().write("显示输出");

    }
    //模拟异步请求响应
    @RequestMapping("/testAjax")
    public @ResponseBody
    User testAjax(@RequestBody User user){
        System.out.println("testAjax方法执行了...");
        // 客户端发送ajax的请求，传的是json字符串，后端把json字符串封装到user对象中
        System.out.println(user);
        // 做响应，模拟查询数据库
        user.setUsername("tom");
        user.setPassword("789");
        // 做响应
        return user;
    }
    }

