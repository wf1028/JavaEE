<%--
  Created by IntelliJ IDEA.
  User: 王飞
  Date: 2019/10/15
  Time: 10:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach items="${list}" var="account">
    ${account.name}
</c:forEach>
</body>
</html>
