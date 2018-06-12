<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/6/12
  Time: 15:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<sf:form method="post" commandName="user">
    First name:<sf:input path="name"/>
    <sf:errors path="name"/>
    Last name:<sf:input path="age"/>
    <sf:errors path="age"/>
    Email:<sf:input path="sex"/>
    <sf:errors path="sex"/>
    <%--Username:<sf:input path="username"/>--%>
    <%--Password:<sf:input path="password"/>--%>
    <input type="submit" value="register">
</sf:form>

</body>
</html>
