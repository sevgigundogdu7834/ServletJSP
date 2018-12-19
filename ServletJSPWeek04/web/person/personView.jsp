<%--
  Created by IntelliJ IDEA.
  User: sevgigundogdu
  Date: 2.12.2018
  Time: 20:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="_03_requestDispatchMode.Person" %>    //importların yapıldığı kısım
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    //bu kısım java kodu

    List<Person> personList=(List<Person>) request.getAttribute("persons");


    %>

<table>

    <%

        for(Person p:personList){
    %>

    <tr>
        <td><%= p.getName() %>/td>
        <td><%= p.getSurname() %>/td>
    </tr>
    <% } %>
</table>


</body>
</html>
