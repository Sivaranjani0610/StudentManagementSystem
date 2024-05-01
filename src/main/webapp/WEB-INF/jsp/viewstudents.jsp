<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%> 
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Students</title>
<spring:url value="/resources/css/main.css" var="mainCss" />
<link href="${mainCss}" rel="stylesheet" />
<style>
tr:nth-child(even) {background-color: red;}
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

		
		
		<div align="center">
		<h1>Students List</h1> 
		<input type="text" id="myInput" onkeyup="myFunction()" placeholder="Search for names.." title="Type in a name">
		<table float="center" id="myTable">  
		<tr><th>Id</th><th>First Name</th><th>Surname</th><th>Year Group</th><th>DOB</th><th>School Name</th><th>Guardian Name</th><th>Guardian No</th><th>Address</th><th>Update</th><th>Delete</th><th>Deactivate</th></tr>  
		   <c:forEach var="viewstu" items="${list}" varStatus="status">   
		   <tr>  
		   <td>${status.index + 1}</td>  
		   <td>${viewstu.firstname}</td>  
		   <td>${viewstu.surname}</td>  
		   <td>${viewstu.year}</td>  
		   <td>${viewstu.dateofbirth}</td>
		   <td>${viewstu.schoolname}</td>
		   <td>${viewstu.guardianname}</td>
		   <td>${viewstu.guardianno}</td>
		   <td>${viewstu.address}</td>
		     
		   <td><a href="editstud/${viewstu.studentid}"><button class="btn">Edit</button></a></td>  
		   <td><a href="deletestud/${viewstu.studentid}"><button class="btn">Delete</button></a></td>
		   <td><a href="inactive/${viewstu.studentid}"><button class="btn">Deactivate</button></a></td>
		   <td><a href="deletestud/${viewstu.studentid}"><button class="btn">Save</button></a></td>
		    
		   </tr>  
		   </c:forEach>  
		   </table>  
		   <br/>  
		   
		   <a href="studentform"><button class="btn">Add New Student</button></a> 
		     
	</div>
	<script>
function myFunction() {
  var input, filter, table, tr, td, i, txtValue;
  input = document.getElementById("myInput");
  filter = input.value.toUpperCase();
  table = document.getElementById("myTable");
  tr = table.getElementsByTagName("tr");
  for (i = 0; i < tr.length; i++) {
    td = tr[i].getElementsByTagName("td")[1];
    if (td) {
      txtValue = td.textContent || td.innerText;
      if (txtValue.toUpperCase().indexOf(filter) > -1) {
        tr[i].style.display = "";
      } else {
        tr[i].style.display = "none";
      }
    }       
  }
}
</script>
	
</body>
</html>