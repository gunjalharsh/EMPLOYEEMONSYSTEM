package com.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.employee.dao.EmployeeDaoImpl;
import com.employee.model.Employee;

//SERVICE IS THE MIDDLE LAYER
@Service   //get from @repository and connects to @controller
@Transactional  //database transaction
public class employeeServiceImpl {
	
	
	
	@Autowired
	private EmployeeDaoImpl employeeDao1;
	
	public void createEmployee(Employee employee) 
	{
	
		
		employeeDao1.createEmployee(employee);
		
		
	}
	
	@Transactional
	public List<Employee> getemp() 
	{
		
		return employeeDao1.getEmployee();
	}


}
