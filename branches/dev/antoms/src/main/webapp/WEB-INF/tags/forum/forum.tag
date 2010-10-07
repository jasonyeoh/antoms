<%@ tag language="java" pageEncoding="ISO-8859-1"%>
<%@ attribute name="menuClass" required="false"%>
<%@ attribute name="menuItemClass"  required="false" %>
<%@ attribute name="menuAltItemClass" fragment="false"%>
<%!
public String strDef(String input, String def){
	if(input != null && !input.trim().equals("")){
		return input;
	}else
		return def;
	}
%>
<!-- Menu Tag - Start -->
<div class="<%= strDef(menuClass,"menu")%>">
	<ul>
		<li class="<%= strDef(menuItemClass,"menu-item")%>">Home</li>
		<li class="<%= strDef(menuAltItemClass,strDef(menuItemClass,"menu-item"))%>">Blog</li>
		<li class="<%= strDef(menuItemClass,"menu-item")%>">Forum</li>
		<li class="<%= strDef(menuAltItemClass,strDef(menuItemClass,"menu-item"))%>">Catalog</li>
		<li class="<%= strDef(menuItemClass,"menu-item")%>">Store</li>
		<li class="<%= strDef(menuAltItemClass,strDef(menuItemClass,"menu-item"))%>">UI Admin</li>
		<li class="<%= strDef(menuItemClass,"menu-item")%>">About Us</li>
		<li class="<%= strDef(menuAltItemClass,strDef(menuItemClass,"menu-item"))%>">Contact Us</li>
	</ul>
<jsp:doBody/>	
</div>
<!-- Menu Tag - End -->