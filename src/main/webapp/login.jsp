<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<%@taglib uri="/struts-tags" prefix="s" %>
<center>
<s:form action="login">
	<s:textfield key="name" label="Enter User Name" /><s:actionerror/>
	<s:password key="password" label="Enter Password" /><s:actionerror/>
	<s:submit value="Login"/>
</s:form>
</center>
</body>
</html>