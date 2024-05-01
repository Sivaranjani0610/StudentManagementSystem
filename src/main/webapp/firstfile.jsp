<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>First File</title>
<style>
body{
 background-color: white;
  
}
h1{
color: rgba(255, 99, 71, 0.5)
}
.btn {
  background-color: rgba(255, 99, 71, 0.5);
  border: none;
  color: white;
  padding: 16px 32px;
  text-align: center;
  font-size: 16px;
  margin: 4px 2px;
  opacity: 1;
  transition: 0.3s; 

}

.btn:hover {opacity: 0.6}
.b{position: absolute;
bottom:0px;}
</style>
</head>
<body>
<center><h1>Student Management System</h1></center>
<center><img
        src="${pageContext.request.contextPath}/resources/img/bg.jpeg" /> </center>
	<table align="center">
		<tr>
			<td><a href="loginpage"><button class="btn">Login User</button></a></td>
			<br>
			<br>
			<br>
			<br>
			<td><a href="registerpage"><button class="btn">Register User</button></a></td>
			<br>
			<br>
			<br>
			<br>
			
		</tr>
	</table>
</body>
</html>