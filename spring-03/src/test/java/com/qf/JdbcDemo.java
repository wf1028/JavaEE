package com.qf;



import com.qf.config.SpringConfigger;
import com.qf.entity.User.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import javax.sql.DataSource;
import java.lang.reflect.AnnotatedArrayType;
import java.sql.SQLException;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = "classpath:Bean.xml")//通过xml配置
@ContextConfiguration(classes = SpringConfigger.class)//通过类配置
public class JdbcDemo {


     @Test
    public void test1(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigger.class);
        DataSource dateSource1 = (DataSource) context.getBean("dateSource1");
        try {
            System.out.println(dateSource1.getConnection());
        } catch (SQLException e) {
        }
    }
    @Test
    public void test2(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigger.class);
        DataSource dateSource1 = (DataSource) context.getBean("dataSource");
        JdbcTemplate jt = new JdbcTemplate();
        jt.setDataSource(dateSource1);
        System.out.println(jt);
        List<User> query = jt.query("select* from user", new BeanPropertyRowMapper<User>(User.class));
        for(User user:query){
            System.out.println(user.getLoginname());
        }

    }

    @Test
    public void test3(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigger.class);
        JdbcTemplate jt = (JdbcTemplate) context.getBean("jdbcTemplate");
       // JdbcTemplate jt = new JdbcTemplate();
      //  jt.setDataSource(dateSource1);
        System.out.println(jt);
        List<User> query = jt.query("select* from user", new BeanPropertyRowMapper<User>(User.class));
        for(User user:query){
            System.out.println(user.getLoginname());
        }

    }
}
