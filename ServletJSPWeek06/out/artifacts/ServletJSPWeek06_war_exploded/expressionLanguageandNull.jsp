<%--
  Created by IntelliJ IDEA.
  User: sevgigundogdu
  Date: 21.12.2018
  Time: 20:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%-- Jsp olmayan değerleri görmezden gelir hata vermez.--%>
<p> ${foo}</p>
<p> ${foo[bar]}</p>

<p> ${100-foo}</p>
<p> ${100+foo}</p>
<p> ${100/foo}</p>



</body>
</html>
