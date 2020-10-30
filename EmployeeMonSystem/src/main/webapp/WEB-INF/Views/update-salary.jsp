<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd" >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" >
<title>Update Salary</title>

<link href="${pageContext.request.contextPath}/resources/css/PharmaRegister.css" rel="stylesheet" >
<h2>Update Salary</h2>
</head>
<body>
<div class="container">
<form:form id="updSal" name="updSal" modelAttribute="upd" method="get" action="${pageContext.request.contextPath}/updatesalary">
		<form:hidden path="tme_emp_id" name="tme_emp_id"/>
		<label>Name<sup>*</sup></label><form:input class="left" name="tme_emp_name" path="tme_emp_name" /><br>
		<label>Project Name<sup>*</sup></label><form:textarea class="left" name="tme_emp_project_name" path="tme_emp_project_name"/><br>
		<label>Salary<sup>*</sup></label><form:input class="left" name="tme_salary" path="tme_salary"/><br>
		<br>
		<button type="submit" class="btn btn-primary">Update Salary</button>
	</form:form><br>
	<a class="btn btn-info" href="/EmployeeMonSystem/view">View all our Employees</a>
	</div>
	<script src="webjars/jquery/3.3.1/jquery.min.js"></script>
<script src="webjars/bootstrap/4.1.0/js/bootstrap.min.js"></script>
</body>
</html>