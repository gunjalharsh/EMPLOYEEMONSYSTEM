package com.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.employee.dao.EmployeeDaoImpl;
import com.employee.model.Employee;

import entities.Drug;

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
	@Transactional
	public void deleteemp(String theId)
	{
		employeeDao1.deleteEmp(theId);
	}

	@Transactional
	public void updateSalary(int id, String name, String project_name, String salary) {
		employeeDao1.updateSalary(id, name, project_name, salary);
		
	}  
	/*
	@Transactional
	 public Employee updateEmployee(Employee employee) {
	        // TODO Auto-generated method stub
	        return employeeDao1.updateEmployee(employee);
	    }
	@Transactional
	public Employee getEmployee(int employeeId) {
        return employeeDao1.getEmployee(employeeId);
    }   */
	
	@Transactional
	public List<Employee> searchEmployee(String name){
	 	return employeeDao1.searchEmployee(name);
		
	}

}
