<%--
  Created by IntelliJ IDEA.
  User: sevgigundogdu
  Date: 21.12.2018
  Time: 16:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<p><h1> Map bean kullanımı </h1></p>
<p> ${ map1.key1} </p>
<p> ${ map1.key2} </p>
<p> ${ map1.key3} </p>
<p> ${ map1.key4} </p>    <%-- Mapte yer almamasına rağmen hata vermez. --%>


<p> ${ map12.key4} </p>     <%-- Böyle bir map olmamasına rağmen hata vermez.. --%>

<p><h1>MyList bracket kullanımı </h1></p>
<p> ${ myList[0]}</p>
<p> ${ myList[1]}</p>
<p> ${ myList[2]}</p>

</body>
</html>
