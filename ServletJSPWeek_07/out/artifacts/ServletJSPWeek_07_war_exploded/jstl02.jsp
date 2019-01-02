<%--
  Created by IntelliJ IDEA.
  User: sevgigundogdu
  Date: 27.12.2018
  Time: 15:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<c:set var="examResult" value="80" scope="request"/>
<c:set var="username" value="admin" scope="request"/>

<c:if test="${examResult gt 65}">

    <h1> Sınavı geçtin ! </h1>
</c:if>

<c:if test="${username eq 'admin'}">

    <h1> Welcome Admin !... </h1>

</c:if>

<%

    String examResult=(String) request.getAttribute("examResult");

    if(Integer.parseInt(examResult)>65){

        %>

<h2> Sınavı geçtinnnnn! </h2>

<% }%>

<c:set var="salary" value="5000" scope="request"/>

<c:choose>
    <c:when test="${salary<1500}">
        <p> Düşük maaş </p>
    </c:when>

    <c:when test="${salary<4000}">
        <p> Orta maaş </p>
    </c:when>

    <c:when test="${salary>4000}">
        <p> İyi maaş </p>
    </c:when>
</c:choose>

</body>
</html>
