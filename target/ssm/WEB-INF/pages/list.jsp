<%--
  Created by IntelliJ IDEA.
  User: liubinwe
  Date: 5/2/20
  Time: 3:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>list</title>
</head>
<body>
    Full Account Lists <br/>
    <c:forEach items="${accountList}" var="account">
        ${account.name} <span class="tab"> ${account.money}<br/>
    </c:forEach>
</body>
</html>
