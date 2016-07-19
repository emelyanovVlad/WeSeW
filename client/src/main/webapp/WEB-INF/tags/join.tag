<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ tag language="java" trimDirectiveWhitespaces="true" %>
<%@ attribute name="active" required="false" type="java.lang.Boolean" %>

<c:choose>
    <c:when test="${sessionScope.logged_user}">
        <a href="/profile" <c:if test="${active}"> class="active"</c:if>>profile</a>
    </c:when>

    <c:otherwise>
        <a href="/join" <c:if test="${active}"> class="active"</c:if>>join</a>
    </c:otherwise>
</c:choose>