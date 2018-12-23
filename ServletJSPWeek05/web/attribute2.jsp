<%--
  Created by IntelliJ IDEA.
  User: sevgigundogdu
  Date: 19.12.2018
  Time: 23:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%= application.getAttribute("applicationAttribute")%>  <%-- application attribute value--%>
<%= request.getAttribute("requestAttribute")%>             <%-- null--%>
<%= session.getAttribute("sessionAttribute")%>             <%-- session attribute value--%>

</body>
</html>
