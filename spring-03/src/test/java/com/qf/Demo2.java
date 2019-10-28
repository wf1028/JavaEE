package com.qf;

import com.qf.config.SpringConfigger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = "classpath:Bean.xml")//通过xml配置
@ContextConfiguration(classes = SpringConfigger.class)//通过类配置
public class Demo2 {
    @Value("${jdbc.driver}")
    private String driver;

    @Value("${jdbc.url}")
    private String url;

    @Value("${jdbc.username}")
    private String username;

    @Value("${jdbc.password}")
    private String password;

    @Test
    public  void  test(){
        System.out.println(driver);
        System.out.println(password);
        System.out.println(username);
    }
}
