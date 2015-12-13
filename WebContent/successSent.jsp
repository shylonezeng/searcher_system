<%@ page language="java" contentType="text/html; charset=utf8"
    pageEncoding="utf8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ taglib prefix="s" uri="/struts-tags" %>
<title>信息发送通知</title>
</head>
<body>
	你已经成功发送短信!
	<ul>
		<li>ognl name:<s:property value="name"/></li>
		<li>ognl passwd:<s:property value="passwd"/></li>
	</ul>
	
</body>
</html>