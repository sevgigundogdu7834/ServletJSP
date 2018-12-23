<%--
  Created by IntelliJ IDEA.
  User: sevgigundogdu
  Date: 19.12.2018
  Time: 16:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List,java.util.ArrayList" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h1> Hello JSP World </h1>

<%
    System.out.println("hello jsp file ");
    List list=new ArrayList();
    list.add("elma");
    list.add("armut");
    list.add("kel mahmut :) ");

    %>

<%
    String user="admin user ";
%>

<%=user%>
<%= list %>
<%--
1) expression sonuna ; koyma
2) = koymayı unutma yoksa scriplet olur.
3) < ile % arasında boşluk olmasın.
--%>

<%--// Java Scriplet ve Jave Expression kodları, translate edilirken (jsp->java) aynı method içerisinde yer alır.Dolayısıyla tanımlanan--%>
<%--// değişkenler local değişkenlerdir.--%>

<%!

    public int calculate(int a,int b){

        return a+b;
    }
%>

<%= calculate(12,13) %>

<!-- Bu yorum html yorumudur browser tarafından görüntülenir. -->
<%-- Bu yorum developer yorumudur browser tarafından görüntülenmez. --%>

</body>
</html>
