
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <th>id</th>
        <th>名字</th>
        <th>金额</th>
    </tr>
    <c:forEach items="${list}" var="c" varStatus="vs">
        <tr>
            <td>${c.id}</td>
            <td>${c.name}</td>
            <td>${c.money}</td>
        </tr>
    </c:forEach>

</table>
</body>
</html>
