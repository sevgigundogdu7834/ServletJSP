<%--
  Created by IntelliJ IDEA.
  User: sevgigundogdu
  Date: 21.12.2018
  Time: 16:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1> Employee Expression Language </h1>

<p>${employeeAttribute.id}</p>
<p>${employeeAttribute.name}</p>
<p>${employeeAttribute.salary}</p>
<p>${employeeAttribute.department.id}</p>
<p>${employeeAttribute.department.name}</p>

<h1> Bracket </h1>

<p>${employeeAttribute['id']}</p>
<p>${employeeAttribute["name"]}</p>
<p>${employeeAttribute['salary']}</p>
<p>${employeeAttribute['department']['id']}</p>
<p>${employeeAttribute['department']['name']}</p>

</body>
</html>
