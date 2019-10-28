package com.qf.controller;

import com.qf.entity.CollectionDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Controller
//@Scope("prototype")
public class Collcetion {
     @Autowired
    //@Qualifier("coll")
  /*  @Resource(name = "collectionDemo")*/
    private CollectionDemo collectionDemo;

    public void test(){
        System.out.println(collectionDemo);
    }
    @PostConstruct
    public void init(){
        System.out.println("创建");
    }
    @PreDestroy
    public void destory(){
        System.out.println("销毁");
    }

}
