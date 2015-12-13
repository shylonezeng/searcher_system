<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.opensymphony.xwork2.util.* " %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% ValueStack vs = (ValueStack)request.getAttribute("struts.valueStack");
	String name = (String)vs.findValue("username");
	%>
	<p>Welcome <%=name %></p>
</body>
</html>