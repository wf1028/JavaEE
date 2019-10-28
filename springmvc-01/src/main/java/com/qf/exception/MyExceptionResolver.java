package com.qf.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyExceptionResolver implements HandlerExceptionResolver {

    @Override
    public ModelAndView resolveException(HttpServletRequest request,
                                         HttpServletResponse response, Object object, Exception exception) {

        ModelAndView mv = new ModelAndView();

     /*   // 判断异常类型
        if (exception instanceof MyException) {
            // 如果是自定义异常，读取异常信息
            mv.addObject("msg", exception.getMessage());
        } else {
            // 如果是运行时异常，则取错误堆栈，从堆栈中获取异常信息
            mv.addObject("msg", "未知异常");
        }*/
        // 返回错误页面，给用户友好页面显示错误信息

        mv.addObject("msg", exception.getMessage());
        mv.setViewName("/error.jsp");

        return mv;
    }
}