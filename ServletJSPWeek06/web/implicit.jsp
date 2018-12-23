<%--
  Created by IntelliJ IDEA.
  User: sevgigundogdu
  Date: 21.12.2018
  Time: 20:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<p>${ cookie.username.value}</p>     //admin
<p><%= request.getMethod() %></p>    //GET
<p>${ pageContext.request.method}</p>    // GET
<p><%= request.getHeader("host") %></p>  // localhost:8080
<p>${header.host}</p>                       // localhost:8080

<p>${ myAttribute}</p>
<p>${ requestScope.myAttribute}</p>
<p>${ sessionScope.myAttribute}</p>
</body>
</html>
