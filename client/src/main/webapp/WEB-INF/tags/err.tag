<%@ include file="/WEB-INF/view/pages/dir/libs.jspf" %>
<%@ tag language="java" trimDirectiveWhitespaces="true" %>
<%@ attribute name="key" required="true" type="java.lang.String" %>

<c:if test="${not empty errors[key]}">
    <span>${errors[key]}</span>
</c:if>