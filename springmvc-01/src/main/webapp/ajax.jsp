<%--
  Created by IntelliJ IDEA.
  User: 王飞
  Date: 2019/10/14
  Time: 22:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

<html>
<%
    String path = request.getRequestURI();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path;
%>
<base href="<%=basePath%>">
<head>
    <title>Title</title>
</head>
js/jquery-1.8.3.min.js
<script src="js/jquery-1.8.3.min.js"></script>
<body>
<button id="btn">发送ajax的请求</button>
</body>

<script>
    // 页面加载，绑定单击事件
    $(function () {
        $("#btn").click(function () {
            alert("----");
            // 发送ajax请求
            $.ajax({
                // 编写json格式，设置属性和值
                url: "user/testAjax",
                contentType: "application/json;charset=UTF-8",
                data: '{"username":"jack","password":"123"}',
                dataType: "json",
                type: "post",
                success: function (data) {
                    // data服务器端响应的json的数据，进行解析
                    alert(data);
                    alert(data.username);
                    alert(data.password);
                }
            });

        });
    });
</script>
</html>
