<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
  <head>
    <title>Spitter</title>
    <link rel="stylesheet" 
          type="text/css" 
          href="<c:url value="/resources/style.css" />" >
    <meta http-equiv="page-enter" content="revealtrans(duration=10,transition=1)">
    <meta http-equiv="page-exist" content="revealtrans(duration=10,transition=8)">

  </head>
  <body>
    <h1>Welcome to Spitter</h1>

    <a href="<c:url value="/user" />">Spittles</a> |
    <a href="<c:url value="/spitter/register" />">Register</a>
  </body>
</html>
