<%@ tag language="java" pageEncoding="ISO-8859-1" %>
<%@ include file="/WEB-INF/jsp/include/common-tags.jsp" %>
<%@ attribute  name="username"  description="Name of the use  who is logged" required="true" %>
<%@ attribute  name="visible"  description="View this widget" required="false" type="java.lang.Boolean" %>
<!-- Login Tag - Start -->
<c:if test="${visible}">
<div id="login-widget">
<div id="login-widget-custom">LOGIN STATUS:(<c:out value="${username}" default=""/>")</div>
<jsp:doBody />
</div>
</c:if>
<!-- Login Tag - End -->
