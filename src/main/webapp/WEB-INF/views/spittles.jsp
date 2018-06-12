<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<html>
<head>
    <title>Spitter</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/style.css" />">
</head>
<body>
<div class="spittleForm">
    <h1>Spit it out...<c:out value="${register}"/></h1>
    <form method="POST" name="spittleForm">
        <input type="hidden" name="latitude">
        <input type="hidden" name="longitude">
        <textarea name="message" cols="80" rows="5"></textarea><br/>
        <input type="submit" value="Add"/>
    </form>
</div>
<div class="listTitle">
    <h1>Recent Spittles</h1>
    <ul class="spittleList">
        <c:forEach items="${userList}" var="spittle">
            <li id="spittle_<c:out value="user.name"/>">
                <div class="spittleMessage"><c:out value="${spittle.name}"/></div>
                <div>
                    <span class="spittleTime"><c:out value="${spittle.age}"/></span>
                    <span class="spittleLocation">(<c:out value="${spittle.sex}"/>, <c:out
                            value="${spittle.sex}"/>)</span>
                </div>
            </li>
        </c:forEach>
    </ul>
    <%--<c:if test="${fn:length(userList) gt 20}">--%>
        <hr/>
        <s:url value="/user?count=200&max=100" var="more_url"/>
        <a href="${more_url}">Show more</a>
    <%--</c:if>--%>
</div>
</body>
</html>