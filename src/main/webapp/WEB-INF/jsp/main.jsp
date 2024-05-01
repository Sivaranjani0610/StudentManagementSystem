<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Main</title>
<spring:url value="/resources/css/main.css" var="mainCss" />
<link href="${mainCss}" rel="stylesheet" />
<style>
td{
color:red;
}
center{
color:red;
}
</style>
</head>
<body>

	
	<center><h1>	Hello ${firstname} </h1></center>
		
		<a href="studentform"><button class="btn">Add Students</button></a> 
<br>
<br>
<br>
<br> 
<a href="viewstudents"><button class="btn">View Active Students</button></a>
<br>
<br>
<br>
<br> 
 
 <a href="Inactivestudents"><button class="btn">View Inactive Students</button></a> 
 <br>
<br>
<br>
<br> 
<a href="loginpage"><button class="btn">Sign Out</button></a> 
</body>
</html>