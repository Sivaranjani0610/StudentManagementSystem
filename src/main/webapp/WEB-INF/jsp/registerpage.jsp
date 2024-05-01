<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
<spring:url value="/resources/css/main.css" var="mainCss" />
<link href="${mainCss}" rel="stylesheet" />
<style>
body{
background-color:white;
}
h1{
color:blue;
}
</style>
</head>

<body>
<h1><center>REGISTRATION FORM</center></h1>

	<form:form id="regForm" modelAttribute="user" action="registermethod"
		method="post">

		<table align="center">
			<tr>
				<td><form:label path="username">Username(*)</form:label></td>
				<td><form:input path="username" name="username" id="username" />
				<form:errors path="username" name="username" id="username" cssClass="error" /></td>
				
			</tr>
			<tr>
				<td><form:label path="password">Password(*)</form:label></td>
				<td><form:password path="password" name="password"
						id="password" /><form:errors path="password" name="password"
						id="password" cssClass="error" /></td>
						
			</tr>
			<tr>
				<td><form:label path="firstname">FirstName</form:label></td>
				<td><form:input path="firstname" name="firstname"
						id="firstname" /></td>
			</tr>
			
			<tr>
				<td></td>
				<td><form:button id="register" name="register" class="signupbtn">Register</button></form:button></td>
			</tr>
			<tr></tr>
			
		</table>
	</form:form>

</body>
</html>