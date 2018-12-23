<%--
  Created by IntelliJ IDEA.
  User: sevgigundogdu
  Date: 21.12.2018
  Time: 15:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<jsp:useBean id="employeeAttribute" class="_01_Model.Employee" scope="request"/>

<p> Employee Use Bean </p>
<h1><jsp:getProperty name="employeeAttribute" property="id"/></h1>
<h1><jsp:getProperty name="employeeAttribute" property="name"/></h1>
<h1><jsp:getProperty name="employeeAttribute" property="salary"/></h1>
<h1><jsp:getProperty name="employeeAttribute" property="department"/></h1> //_01_Model.Department@653f6ad2 to String yok.



</body>
</html>
