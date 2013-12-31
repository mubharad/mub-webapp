<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
<h2>Directory listing</h2>

<c:if test="${not empty dir}">

    <ul>
        <c:forEach var="listValue" items="${dir}">
            <%--<li>${listValue}</li>--%>
            <%--<li><a href="${listValue}">${listValue}</a></li>--%>
            <li><a href="<c:url value="${listValue}"/>">${listValue}</a></li>
        </c:forEach>
    </ul>

</c:if>
</body>
</html>