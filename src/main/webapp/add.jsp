<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ad</title>
</head>
<body>
<%@taglib uri="/struts-tags" prefix="s" %>

<s:form action="tutorials/addTutorial">
	<s:textfield key="language" label="Enter Language Name"/><br>
	<s:submit value="Add"/>
</s:form>
</body>
</html>