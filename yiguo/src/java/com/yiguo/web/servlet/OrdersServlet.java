package com.yiguo.web.servlet;



import com.yiguo.dao.OrdersMapper;
import com.yiguo.dao.UserMapper;

import com.yiguo.entity.OrderDetail;
import com.yiguo.entity.Orders;
import com.yiguo.entity.OrdersExample;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
@WebServlet("/Orders/*")
public class OrdersServlet extends BaseServlet {
    private InputStream in=null;
    private OrdersMapper ordersMapper=null;
    private SqlSession session=null;
    SqlSessionFactory factory=null;
    OrdersExample ordersExample = null;
    public OrdersMapper begin()throws Exception{
        in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2、创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        factory = builder.build(in);
        //3、使用SqlSessionFactory工厂生产SqlSession对象
        session = factory.openSession();
        //4、使用SqlSession创建Dao接口的代理对象
        ordersMapper = session.getMapper(OrdersMapper.class);
        return ordersMapper;
    }
    OrdersMapper begin;
    {
        try {
            begin = begin();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //查看全部订单
    public void findAll(HttpServletRequest req, HttpServletResponse resp) throws ServletException,Exception {

        List<Orders> orders = begin.findAll();
        System.out.println(orders);
        writeValue(orders,resp);
        session.commit();
    }
    //查找未付款订单
    public void findNonPayment(HttpServletRequest req, HttpServletResponse resp) throws ServletException,Exception {

       List<Orders> orders = begin.findByStatus("1");
       for(Orders orders1:orders) {
           System.out.println(orders1);
       }
        writeValue(orders,resp);
        session.commit();
        //6、关闭资源
       /* session.close();
        in.close();*/

    }

    public void AddOrders(HttpServletRequest req, HttpServletResponse resp) throws ServletException,Exception {
        System.out.println("跳槽到这里了");


        OrderDetail orderDetail = (OrderDetail)req.getAttribute("orderDetail");
        Integer id = orderDetail.getId();
        Integer aid = orderDetail.getAid();
        Integer uid = orderDetail.getUid();
        Integer oid = orderDetail.getOid();
        Double money = orderDetail.getMoney();
        String status="1";

      Orders orders = new Orders();
        orders.setAid(aid);
        orders.setId(id);
        orders.setStatus(status);
        orders.setOid(oid);
        orders.setUid(uid);
        orders.setMoney(money);
        System.out.println("执行到这里");
        begin.AddByOrders(orders);
        session.commit();
        writeValue(orders,resp);

    }
    public void changeOrders(HttpServletRequest req, HttpServletResponse resp) throws ServletException,Exception {
        System.out.println("跳槽到这里了");
        OrderDetail orderDetail = (OrderDetail)req.getAttribute("orderDetail");
        Integer id = orderDetail.getId();
        Integer aid = orderDetail.getAid();
        Integer uid = orderDetail.getUid();
        Integer oid = orderDetail.getOid();
        Double money = orderDetail.getMoney();
        Orders orders = new Orders();
        orders.setId(id);
        if (aid!=0||aid!=null){
            orders.setAid(aid);
        }


        if (uid!=0||uid!=null) {
            orders.setUid(uid);
        }
        if (money!=0||money!=null) {
            orders.setMoney(money);
        }
        System.out.println("执行到这里");
        begin.changeOrders(orders);
        session.commit();
        writeValue(orders,resp);


    }
}
