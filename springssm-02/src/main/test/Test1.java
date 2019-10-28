import com.qf.controller.AccountController;
import com.qf.entity.Account;
import com.qf.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test1 {

    @Test
    public void test(){
        // 加载配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        // 获取对象
        AccountService as = (AccountService) ac.getBean("accountService");

        // 调用方法
        List<Account> all = as.findAll();
        System.out.println(all);

    }
 /*   @Test
    public void test2(){
        // 加载配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        // 获取对象
        AccountController as = (AccountController) ac.getBean("accountController");

        // 调用方法
       as.test();*/




}
