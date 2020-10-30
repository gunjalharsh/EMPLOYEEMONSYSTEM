
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  <%@ page isELIgnored="false"%>
  
  <h1>Employee List</h1>  
<table border="3" width="20%">  
<tr><th>EmpId</th><th>Name</th><th>Project Name</th><th>DOJ</th><th>DOB</th><th>Salary</th><th>Role ID </th><th>Delete::</th></tr>  
  <!-- emps === model attribute in controller -->
   <c:forEach var="emp1" items="${emp}">   
   <tr>  
   <td>${emp1.tme_emp_id}</td>  
   <td>${emp1.tme_emp_name}</td>  
   <td>${emp1.tme_emp_project_name}</td>      
   <td>${emp1.tme_DOJ}</td>    
    <td>${emp1.tme_DOB}</td> 
     <td>${emp1.tme_salary}</td> 
      <td>${emp1.tme_role_id}</td>    
        <td>
        <!-- 1.onclick javascript event 2.confirm similar to alert but takes OK CANCEL BUTTONS -->
       <a href="deleteemp/${emp1.tme_emp_id}" onclick="if(!(confirm('Are you sure you want to delete this customer?'))) return false">DeleteRecord</a></td>      
   
   </tr>  
   </c:forEach>  
   </table>