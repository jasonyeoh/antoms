<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ include file="/WEB-INF/jsp/include/common-tags.jsp" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><spring:message code="app.name"/></title>
</head>
<body>
<table>
	<tr>
		<th>#</th>
		<th>Name</th>
		<th>Action</th>
	</tr>

	<c:forEach var="item" items="${catalogs}">
		<tr>
			<td>##</td>
			<td><c:out value="${item.name}" /></td>
			<td><a href="#">V</a>&nbsp;<a href="#">E</a>&nbsp;<a href="#">D</a></td>
		</tr>
	</c:forEach>
</table>
</body>
</html>