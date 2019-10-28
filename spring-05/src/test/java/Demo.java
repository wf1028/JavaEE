import com.qf.service.AccountService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
    @Test
    public void test1(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountService service = (AccountService)context.getBean("accountService");
        service.transfer(1,2,100d);

    }
}
