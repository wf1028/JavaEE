<%--
  Created by IntelliJ IDEA.
  User: 王飞
  Date: 2019/10/11
  Time: 10:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="user/login?id=1">登录</a>
<hr>
<form action="user/testParm" method="post">
    username<input type="text" name="username"><br>
    password<input type="password" name="password"><br>
    <input type="submit">
</form>

<hr>
<form action="user/testFarm">
    username<input type="text" name="username"><br>
    password<input type="password" name="password"><br>
    <input type="submit">
</form>

<hr>
<form action="user/testBean">
    username<input type="text" name="username"><br>
    password<input type="password" name="password"><br>
    Car<input type="text" name="car.cname"><br>
    List<input type="text" name="list[0].cname"><br>
    Map<input type="text" name="map['1001'].cname"><br>
    Date<input type="date" name="date"><br>
    <input type="submit" name="选择">
</form><br>
<form action="user/testPathVariable">
   登陆传值 <input type="text" name="userId">
</form>
<a href="user/testPathVariable/10">testPathVariable</a>
<form action="user/testRequestBody" method="post">RequestBody注解 post方式获取请求体内容<br>
    username<input type="text" name="username"><br>
    password<input type="password" name="password"><br>
    <input type="submit">


</form>
<a href="user/testException">testException</a>
<br>
<a href="user/testInterceptor">testInterceptor</a>
<a href="user/testResponseBody">responseBody获得数据</a><br/>
<a href="user/testResponseBody2">responseBody获得数据</a>
</body>
</html>
