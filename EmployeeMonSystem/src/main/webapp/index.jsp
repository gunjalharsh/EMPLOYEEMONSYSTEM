<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Monitoring System</title>


<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/login.css"/>">
<body style="background-image:url(resources/images/1.jpg)"> 
<br><br>

<html>

	<div class="container">
		<form:form action=register method="post" modelAttribute="employee">
		<h2>Employee Monitoring System</h2>
		
		</form:form>
	</div>
</body>
<footer class="footer">
      <div class="container">
      
        <table align="center">
                   <tr>
              <td><h3><a href="callproj">Employee Data Entry</a></h3></td>  
             </tr>
             </table>
      </div>
</footer>
</html>
</head>
<body>
 <!--  
    <div class="login-box">
     <img src="<c:url value="/resources/images/avatar.png"></c:url>" class="avatar">    
        <h1>Welcome to Employee Monitoring System</h1>
           <form action=register method="post" modelAttribute="employee">
            <br>

           <table align="center">
           
           <tr>
           <td>&nbsp</td>
           </tr>
            <tr>
           <td>&nbsp</td>
           </tr>
           
           <tr>
              <td><a href="callproj">Employee Data Entry</a></td>  
             </tr> 
               <tr>
              <br>
              <tr>
           <td>&nbsp</td>
           </tr>
            <tr>
           <td>&nbsp</td>
           
             </table>
              
            </form>
        
        
        </div>
    
    </body>   -->

<footer class="footer">
      <div class="container">
        <span class="text-muted">&copy; Employee Monitoring System</span>
      </div>
</footer>
</html>