<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: sevgigundogdu
  Date: 28.12.2018
  Time: 13:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<c:forEach var="numbers" begin="1" end="10">
    <c:out value="${numbers}"/>
</c:forEach>

<h1> Arrays </h1>
<%

    int[] numbers={3,5,7,9,13,14,67,89};
    request.setAttribute("numberList",numbers);
%>

<c:forEach var="numberListAttribute" items="${numberList}">
   <h2>${numberListAttribute}</h2>
</c:forEach>

<c:forEach var="numberListAttribute" items="${numberList}" varStatus="loopStatus">
    <h2>${loopStatus.index}</h2>,${numberListAttribute}
</c:forEach>

<h1> Lists </h1>

<%

    List<String> stringList=new ArrayList<String>();
    stringList.add("Elma");
    stringList.add("Armut");
    stringList.add("Vişne");
    stringList.add("Üzüm");
    request.setAttribute("listAttribute",stringList);
%>

<c:forEach var="list" items="${listAttribute}" >

   <h3>${list}</h3>

</c:forEach>

<h1> Maps </h1>
<%

    Map<Integer,String> map=new HashMap<>();
    map.put(1,"Ali");
    map.put(2,"Veli");
    map.put(3,"KırkDokuz");
    map.put(4,"Elli");
    request.setAttribute("requestAttribute",map);

%>

<c:forEach var="mapAttribute" items="${requestAttribute}" >
    <h2>${mapAttribute}</h2>
</c:forEach>

<h1> For Tokens</h1>

<c:forTokens items="1,2,3,4,5,6,7,8,9,10" delims="," var="fortokens">
    <h3>${fortokens}</h3>
</c:forTokens>
</body>
</html>
