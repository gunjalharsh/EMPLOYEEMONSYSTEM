<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Salaries here</title>
<link href="webjars/bootstrap/4.1.0/css/bootstrap.min.css" rel="stylesheet">
<h2 style="text-align: center">Employee Salary</h2>
</head>
<body>
<br><br>
	<div class="container">
		<table class="table table-striped">
			
			<thead>
				<tr>
					<th>Name</th>
					<th>Project Name</th>
					<th>Salary</th>
					
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${emp}" var="e">
					<tr>
						<td>${e.tme_emp_name}</td>
						<td>${e.tme_emp_project_name}</td>
						<td>${e.tme_salary}</td>
						
					</tr>
				</c:forEach>
			</tbody>
			
		</table>
	</div>

<script src="webjars/jquery/3.3.1/jquery.min.js"></script>
<script src="webjars/bootstrap/4.1.0/js/bootstrap.min.js"></script>
</body>
</html>