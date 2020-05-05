<%--
  Created by IntelliJ IDEA.
  User: liubinwe
  Date: 5/2/20
  Time: 3:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Lamy</title>
</head>
<body>
    <div>
        <a href="/account/findAll">Find All Accounts</a> <br/>
    </div>
    <div>
        <form action="/account/save" method="post">
            Name: <input type="text" name="name"/> <br/>
            Money: <input type="text" name="money"/> <br/>
            <input type="submit" value="Submit"/>
        </form>
    </div>
</body>
</html>
