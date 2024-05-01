<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%> 
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>   
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Inactive Students Page</title>
<spring:url value="/resources/css/main.css" var="mainCss" />
<link href="${mainCss}" rel="stylesheet" />
<style>
tr:nth-child(even) {background-color: pink;}
tr{
color:red;
}
body{
 background-color: white;
  
}
h1{
color:black;
}
</style>
</head>
<body>

	<div align="center" class="card">
		<h1>Inactive Students</h1> 
		<form:form method="post" action="/StudentManagementSystem/del"> 
		
		
		<table float="center">  
		<tr><th>Id</th><th>First Name</th><th>Surname</th><th>Year</th><th>DOB</th><th>School Name</th><th>Guardian Name</th><th>Guardian No</th><th>Address</th><th>Action</th></tr>  
		  
		   <c:forEach var="ca" items="${list}" varStatus="status">  
		   
		   <tr>  
		   <td>${status.index + 1}</td>  
		   <td>${ca.firstname}</td>  
		   <td>${ca.surname}</td>  
		   <td>${ca.year}</td>  
		   <td>${ca.dateofbirth}</td>
		   <td>${ca.schoolname}</td>
		   <td>${ca.guardianname}</td>
		   <td>${ca.guardianno}</td>
		   <td>${ca.address}</td>  
		   <td><a href="deleteitem/${ca.studentid}">Remove</a></td>
		   
		   </tr>  
		   </c:forEach> 
		  
		   </table> 
		  
		   <br/>  
		   
		  
		  
		    </form:form> 
	</div>
</body>
</html>