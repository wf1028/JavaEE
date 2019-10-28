package com.qf;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class advice {
    @Pointcut("execution(* com.qf.dao.impl.UserDaoImpl.*(..))")
    public void pc(){

    }
    @Before("advice.pc()")
    public void before(){
        System.out.println("前置增强");
    }
    @After("advice.pc()")
    public void after(){
        System.out.println("后置增强，出现异常也会通知");
    }
    @Around("advice.pc()")
    public void around(ProceedingJoinPoint point) throws Throwable {
        System.out.println("前置环绕通知");
        Object proceed = point.proceed();
        System.out.println("后置环绕通知");
    }
    @AfterReturning("advice.pc()")
    public void afterreturning(){
        System.out.println("后置通知，出现异常不会通知");
    }
    @AfterThrowing("advice.pc()")
    public void afterthrowing(){
        System.out.println("异常通知，出现异常会通知");
    }

}
