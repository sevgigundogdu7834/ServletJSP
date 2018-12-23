<%--
  Created by IntelliJ IDEA.
  User: sevgigundogdu
  Date: 20.12.2018
  Time: 23:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="_01_Model.Employee" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<p><h1><%= ((Employee)(request.getAttribute("employeeAttribute"))).getId() %></h1> </p>
<p><h1><%= ((Employee)(request.getAttribute("employeeAttribute"))).getName() %></h1> </p>
<p><h1><%= ((Employee)(request.getAttribute("employeeAttribute"))).getSalary() %></h1> </p>
<p><h1><%= ((Employee)(request.getAttribute("employeeAttribute"))).getDepartment() %></h1> </p>

</body>
</html>
