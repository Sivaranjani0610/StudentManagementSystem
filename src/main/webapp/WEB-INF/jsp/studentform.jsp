<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%> 
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>   
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Students</title>
<spring:url value="/resources/css/main.css" var="mainCss" />
<link href="${mainCss}" rel="stylesheet" />
<style>

tr{
color:black;
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
	<div align="center" class="des">
		  <h1>Enter the New Student Details</h1> 
		  
		  <pre>
       <form:form method="post" action="addnewstud">    
         
          First Name :      <form:input path="firstname"  />
           
           
          Surname :         <form:input path="surname"  />  
          
            
          Year Group :      <form:input path="year" />
           
           
          DOB :             <form:input path="dateofbirth" />
           
          
          School Name :     <form:input path="schoolname" /> 
         
           
          Guardian Name :   <form:input path="guardianname" /> 
         
           
          Guardian No :     <form:input path="guardianno" />
           
           
          Address :        <form:input path="address" />
          
          
          <input type="submit" value="Save" class="btn" />
            
               
       </form:form>    
      
       </pre>
	</div>
</body>
</html>