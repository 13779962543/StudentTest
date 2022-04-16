<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2022/4/15
  Time: 13:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>scorePage</title>
</head>
<body>
<c:forEach items="${arr}" var="item">
    科目:${item.getA()}&nbsp;&nbsp;&nbsp;
    成绩:${item.getB()}<br>
</c:forEach>



</body>
</html>
