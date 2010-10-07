<%@ tag language="java" pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/jsp/include/common-tags.jsp"%>
<%@ attribute name="title" description="Title of the page" required="false"%>
<%@ attribute name="dontAppend" description="Append to the application name" required="false" type="java.lang.Boolean"%>
<!-- HTML Head Tag - Start -->
<c:choose>
	<c:when test="${dontAppend}">
		<title>${title}</title>
	</c:when>
	<c:otherwise>
		<title>Ant :: OMS :: ${title}</title>
	</c:otherwise>
</c:choose>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/applications.js"></script>
<link type="text/css" href="<%=request.getContextPath()%>/css/applications.css"></link>
<!--  include applications third party js libraries and css files-->
<script type="text/javascript"
	src="http://www.google.com/jsapi?key=ABQIAAAA29McmnfKTnfuTs8z259d7hTJ_ljTSoKMypwCX_tKoGvsd0ZCJRTmX4rVV-kEpIK1cOhMHR3YWNbnP"
></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/yui-min.js"></script>
<script type="text/javascript">
	google.load("jquery, 1.4.2");
	google.load("jqueryui, 1.8.5");
	//-->
</script>
<jsp:doBody />
<!-- HTML Head Tag - End -->
