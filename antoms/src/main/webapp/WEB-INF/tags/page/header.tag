<%@ tag language="java" pageEncoding="ISO-8859-1" description="Header for the Page" display-name="Site Header" dynamic-attributes="true" body-content="tagdependent" %>
<%@ include file="/WEB-INF/jsp/include/common-tags.jsp" %>
<%@ attribute name="showCommon"  type="java.lang.Boolean"  required="false" %>
<!--  Page Header - Start -->
<div id="header">
<c:if test="${showCommon}">
<span id="site-title">Welcom to My Website</span>
<span id="site-motto">Some motto text here</span>
</c:if>
<jsp:doBody />
</div>
<!--  Page Header - End -->