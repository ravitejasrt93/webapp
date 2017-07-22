<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript">
  function savePerson(){
	  document.getElementById("frmId").action="saveData";
	  document.getElementById("frmId").submit();
  }

  function getAll(){
	  document.getElementById("frmId").action="getAllPersons";
	  document.getElementById("frmId").submit();
  }
   function updatePerson(){
	  document.getElementById("frmId").action="updatePerson";
	  document.getElementById("frmId").submit();
  }
  
  function deletePerson(){
		  document.getElementById("frmId").action="deletePerson";
		  document.getElementById("frmId").submit();
  }
</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <h1> HELLO We are in HOME ...</h1>
     <form  id="frmId" >
        <input type="hidden" name="id" value="${person.id}">
        Name: <input type="text" name="name" value="${person.name }"> <br>
        AGE: <input type="text" name="age" value="${person.age }"> <br>
        Qual: <input type="text" name="qual" value="${person.qual }"> <br>
        Phone: <input type="text" name="phone" value="${person.phone }"> <br>
        <input type="button" value="Save" onclick="savePerson()"> 
        <input type="button" value="ALL" onclick="getAll()"> 
        <input type="button" value="Update" onclick="updatePerson()"> 
        <input type="button" value="DELETE" onclick="deletePerson()"> <br>
     </form>
    
    <table border="2">
        <tr>
         <th>ID</th>
         <th>Name</th>
         <th>AGE</th>
         <th>QUAL </th>
         <th>PHONE </th>
        </tr>
     
	    <c:forEach items="${personList}" var="person">
	        <tr>
	          <td>${person.id}</td>
	          <td><a href="getPersonById?id=${person.id}">${person.name} </a> </td>
	          <td>${person.age}</td>
	          <td>${person.qual}</td>
	          <td>${person.phone}</td>
	        </tr>
	    </c:forEach>
    </table>
    
    
</body>
</html>