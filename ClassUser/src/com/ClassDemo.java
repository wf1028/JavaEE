package com;


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class ClassDemo {
    public static void main(String[] args) throws Exception {
        //第一种获取Class对象的方式
        User user = new User();
        Class clazz1 = user.getClass();

        //第二种获取Class对象的方式
        Class clazz2 = User.class;

        //第三种获取Class对象的方式
        Class clazz3 = Class.forName("com.User");




        System.out.println("-----------获取属性--------------");
        //获取属性
        Field[] fields = clazz3.getDeclaredFields();


        for (Field f : fields) {
            System.out.println("属性名："+f.getName());
            System.out.println("修饰符："+f.getModifiers());
            System.out.println("属性类型："+f.getType());
        }

        System.out.println("--------------获取方法-----------");
        //获取方法
        Method[] methods = clazz3.getDeclaredMethods();

        for (Method m : methods) {
            System.out.println("方法名："+m.getName());
            System.out.println("修饰符："+m.getModifiers());
            System.out.println("返回值类型："+m.getReturnType());
            //获取参数
            Parameter[] parameters = m.getParameters();
            for (Parameter p : parameters) {
                System.out.println("参数名："+p.getName());
                System.out.println("参数类型："+p.getType());
            }
        }

        System.out.println("--------------获取构造器--------------------");
        //获取构造器
        Constructor[] constructors = clazz3.getDeclaredConstructors();

        for(Constructor c : constructors){
            System.out.println("构造器名："+c.getName());
            System.out.println("构造器修饰符："+c.getModifiers());
            //获取参数
            Parameter[] parameters = c.getParameters();
            for (Parameter p : parameters) {
                System.out.println("构造器参数名："+p.getName());
                System.out.println("构造器参数类型："+p.getType());
            }
        }

        System.out.println("--------------创建对象，调用方法--------------------");

        User user2 = (User)clazz3.newInstance();
        //user2.Register();

        //获取某个方法对象，调用
        Method m1 = clazz3.getDeclaredMethod("Register");
        m1.invoke(user2,null);

        Method m2 = clazz3.getDeclaredMethod("Login",String.class);
        Object login = m2.invoke(user2, "tom");
        System.out.println(login);
    }
}