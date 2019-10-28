package com.yiguo.web.servlet;



import com.yiguo.dao.OrderDetailMapper;
import com.yiguo.entity.OrderDetail;
import com.yiguo.entity.OrderDetailExample;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.InputStream;
import java.util.List;

@WebServlet("/OrderDetail/*")
public class OrderDetailServlet extends BaseServlet {
    private InputStream in=null;
    private OrderDetailMapper orderDetailMapper=null;
    private SqlSession session=null;
    SqlSessionFactory factory=null;

    public OrderDetailMapper begin()throws Exception{
        in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2、创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        factory = builder.build(in);
        //3、使用SqlSessionFactory工厂生产SqlSession对象
        session = factory.openSession();
        //4、使用SqlSession创建Dao接口的代理对象
        orderDetailMapper = session.getMapper(OrderDetailMapper.class);
        return orderDetailMapper;
    }
    OrderDetailMapper begin;
    {
        try {
            begin = begin();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //查看所有订单详情
    public void findAll(HttpServletRequest req, HttpServletResponse resp) throws ServletException,Exception {

        List<OrderDetail> all = begin.findAll();
        System.out.println(all);
        writeValue(all,resp);
        session.commit();

    }

    //通过id查看单个订单详情
    public void findById(HttpServletRequest req, HttpServletResponse resp) throws ServletException,Exception {
        String id=req.getParameter("id");
        OrderDetail byId = begin.findById( id);
        System.out.println(byId);
        writeValue(byId, resp);
        session.commit();
    }

    public void AddOrderDetail(HttpServletRequest req, HttpServletResponse resp) throws ServletException,Exception {
        String aid = req.getParameter("aid");
        Integer aid1=Integer.parseInt(aid);
        String pid = req.getParameter("pid");
        Integer pid1=Integer.parseInt(pid);
        String uid = req.getParameter("uid");
        int uid1 = Integer.parseInt(uid);
        String money = req.getParameter("money");
        double money1=Double.parseDouble(money);
        String num = req.getParameter("num");
        Integer num1=Integer.parseInt(num);
        String leaveMessage = req.getParameter("leaveMessage");
        OrderDetail orderDetail = new OrderDetail();
        int number = RundomUtil.number();
        //pid,oid,num,money,aid,leave_message
        orderDetail.setAid(aid1);
        orderDetail.setOid(number);
        orderDetail.setPid(pid1);
        orderDetail.setUid(uid1);
        orderDetail.setMoney(money1);
        orderDetail.setNum(num1);
        orderDetail.setLeaveMessage(leaveMessage);
        begin.AddByOrderDetail(orderDetail);
        session.commit();
        //writeValue(orderDetail, resp);
        req.setAttribute("orderDetail",orderDetail);
        req.getRequestDispatcher("/Orders/AddOrders").forward(req,resp);
    }
    public void changeOrderDetail(HttpServletRequest req, HttpServletResponse resp) throws ServletException,Exception {
        System.out.println("第一步");
        OrderDetail orderDetail = new OrderDetail();
        String aid = req.getParameter("aid");
        System.out.println(aid);
        if(!aid.equals(aid)||!"".equals(aid)){
            Integer aid1=Integer.parseInt(aid);
            orderDetail.setAid(aid1);
        }
        System.out.println("aid通过了");
        String pid = req.getParameter("pid");
        System.out.println(pid+"ces");
        if(pid!=null){
            Integer pid1=Integer.parseInt(pid);
            orderDetail.setPid(pid1);
        }
        System.out.println("pid通过了");


        String uid = req.getParameter("uid");
        if(uid!=null){
            int uid1 = Integer.parseInt(uid);
            orderDetail.setUid(uid1);
        }

        String money = req.getParameter("money");
        if(money!=null){
            double money1=Double.parseDouble(money);
            orderDetail.setMoney(money1);
        }
        String num = req.getParameter("num");
        System.out.println(num+"数量");
        if(num!=null){
            Integer num1=Integer.parseInt(num);
            orderDetail.setNum(num1);
        }

        String leaveMessage = req.getParameter("leaveMessage");
        if(leaveMessage!=null){
            orderDetail.setLeaveMessage(leaveMessage);
        }
        System.out.println("第二步");
        begin.changeOrderDetail(orderDetail);
        session.commit();
        //writeValue(orderDetail, resp);
        System.out.println("第三步");
        req.setAttribute("orderDetail",orderDetail);
        req.getRequestDispatcher("/Orders/changeOrders").forward(req,resp);








    }

}
