<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<body>

<%= "naberrr" %><br>

<c:out value="test"/> <br>

<c:out value="<h1> Properties </h1>" /> <%-- JSTL render etmez. xss saldırılarına karşı da güvenlik sağlar.--%>
<%= "<h1> Properties </h1>"%>           <%-- JSP expression render eder. Güvenli değildir.--%>

<c:set var="sessionAttribute" scope="session" value="test01"/>
<h2><c:out value="${sessionAttribute}"/></h2>

<c:remove var="sessionAttribute"/>
<p> After remove : <c:out value="${sessionAttribute}"/> </p>



</body>
</html>
