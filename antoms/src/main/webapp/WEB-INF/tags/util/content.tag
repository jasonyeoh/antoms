<%@ tag language="java" pageEncoding="ISO-8859-1" description="Extracts context from content repository"%>
<%@ include file="/WEB-INF/jsp/include/common-tags.jsp"%>
<%@ attribute name="id" required="true"  description="Id of the content to be emitted"%>
<%@ attribute name="view" required="false"  description="Type of the view (edit|view|print)"%>
<%@ attribute name="repositoryId" required="false"  description="Id of the content to be emitted"%>
<!-- Content Tag - Start -->
<% 
//Normalizing the input attributes
if (view == null || view.trim().equals(""))
	view="view";
else
	view = view.trim().toLowerCase();
if (repositoryId == null || repositoryId.trim().equals(""))
	repositoryId = "default";
else
	repositoryId = repositoryId.trim().toLowerCase();

%>
<!--  Content: ${id} Repository: ${repositoryId} view: ${view} - Start -->
<!--  Content: ${id} Repository: ${repositoryId} view: ${view} - End -->
<!--  Content Tag - End -->