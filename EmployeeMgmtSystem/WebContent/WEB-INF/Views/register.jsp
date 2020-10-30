
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Employee Registration</title>
<style type="text/css">
.myerror
{
color:red;
}

</style>
</head>

<body>
 <img height = 200 width=200 src="<c:url value="/resources/images/download.png"></c:url>"/>	

	<form:form id="form1" name="form1" modelAttribute="employee" method="post" action="register">
	<f:validateBean disabled="true" />
		<table width="200" border="0" align="center">
			<tr>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td><fieldset>
						<legend>Data Entry</legend>
						<table width="609" border="0" align="center">

							<tr>
								<td width="69">&nbsp;</td>
								<td colspan="2">EmpId</td>
								<td colspan="3"><label> <form:input type="text"
											name="txt_tme_emp_id" id="txt_tme_emp_id" path="tme_emp_id" />
											<form:errors path="tme_emp_id" cssClass="myerror" />
								</label></td>
								<td width="56">&nbsp;</td>
							</tr>
							<tr>
								<td>&nbsp;</td>
								<td colspan="2">Name</td>
								<td colspan="3"><label><form:input type="text"
										name="txt_tme_emp_name" id="txt_tme_emp_name" path="tme_emp_name" />
										<form:errors path="tme_emp_name" cssClass="myerror" />
										</label></td>
								<td width="56">&nbsp;</td>		
								<td>&nbsp;</td>
							</tr>
							<tr>
								<td>&nbsp;</td>
								<td colspan="2">Project Name</td>
								<td colspan="3"><label><form:input type="text" name="txt_tme_emp_project_name"
										id="txt_tme_emp_project_name" path="tme_emp_project_name" />
										<form:errors path="tme_emp_project_name" cssClass="myerror" />
										</label></td>
										<td width="56">&nbsp;</td>
								<td>&nbsp;</td>
							</tr>
							<tr>
								<td>&nbsp;</td>
								<td colspan="2">DOJ</td>
								<td colspan="3"><label><form:input type="text" name="txt_tme_DOJ"
										id="txt_tme_DOJ" path="tme_DOJ" />
								<form:errors path="tme_DOJ" cssClass="myerror" /></label></td>
				                <td width="56">&nbsp;</td>
								<td>&nbsp;</td>
							</tr>
							<tr>
								<td>&nbsp;</td>
								<td colspan="2">DOB</td>
								<td colspan="3"><label><form:input type="text" name="txt_tme_DOB"
										id="txt_tme_DOB" path="tme_DOB" />
								<form:errors path="tme_DOB" cssClass="myerror" /></label></td>
				                <td width="56">&nbsp;</td>
								<td>&nbsp;</td>
							</tr>
							<tr>
								<td>&nbsp;</td>
								<td colspan="2">Salary</td>
								<td colspan="3"><label><form:input type="text" name="txt_tme_salary"
										id="txt_tme_salary" path="tme_salary" />
											<form:errors path="tme_salary" cssClass="myerror" /></label></td>
									 <td width="56">&nbsp;</td>	
								<td>&nbsp;</td>
							</tr>
							<tr>
								<td>&nbsp;</td>
								<td colspan="2">Role Id</td>
								<td colspan="3"><label><form:input type="text" name="txt_tme_role_id"
										id="txt_tme_role_id" path="tme_role_id" />
									<form:errors path="tme_role_id" cssClass="myerror" /></label></td>
										<td width="56">&nbsp;</td>
								<td>&nbsp;</td>
							</tr>
							<tr>
								<td>&nbsp;</td>
								<td>&nbsp;</td>
								<td>&nbsp;</td>
								<td width="60">&nbsp;</td>
								<td width="68"><input type="submit" name="btn_submit"
									id="btn_submit" value="Submit" /></td>
								<td>&nbsp;</td>
							</tr>
							

						</table>

					</fieldset></td>
			</tr>
		</table>

	</form:form>
</body>
</html>
