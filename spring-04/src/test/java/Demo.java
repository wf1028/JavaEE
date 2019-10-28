import com.qf.dao.UserDao;
import com.qf.entity.User;
import com.qf.controller.UserController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Demo {
    @Test
    public void test1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Bean.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        List<User> all = userDao.findAll();
       for (User user:all){
           System.out.println(user.getLoginname());
       }
    }
    @Test
    public void test2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Bean.xml");
        UserController userController = (UserController) applicationContext.getBean("userController");
        List<User> all = userController.test();
        for (User user:all){
            System.out.println(user.getLoginname());
        }
    }

    @Test
    public void test3(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Bean.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        userDao.add();
        userDao.findAll();

    }
}
