<%--
  Created by IntelliJ IDEA.
  User: 王飞
  Date: 2019/10/14
  Time: 21:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="account/findAll">测试查询</a>
<a href="account/test">2</a>
<h3>测试</h3>

<form action="account/save" method="post">
    姓名：<input type="text" name="name" /><br/>
    金额：<input type="text" name="money" /><br/>
    <input type="submit" value="保存"/><br/>
</form>
</body>
</html>
