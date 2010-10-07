<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ include file="/WEB-INF/jsp/include/common-tags.jsp"%>
<html>
<head>
<apage:html-head title="Welcome"/>
</head>
<body>
<apage:header showCommon="false">
	<div id="sub-header">This is a sub header from the page</div>
</apage:header>
<autil:login username="None">
	<div>Login Extra Body</div>
</autil:login>
<div id="content">
<div id="choicemgnt">
<h1>Choice Management</h1>
<autil:content id="choice-management"/>
</div>
<div id="menumgnt">
<h1>Menu Management</h1>
</div>
<autil:content id="menu-management"/>
</div>
<apage:footer>
	<div id="sub-footer">This is a sub footer from the page</div>
</apage:footer>
</body>
</html>