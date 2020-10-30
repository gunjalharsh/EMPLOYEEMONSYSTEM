package com.employee.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.employee.model.Employee;

@Repository
public class EmployeeDaoImpl {
	
	@Autowired
	SessionFactory sessionFactory;//dispatcher-servlet.xml

	public void createEmployee(Employee employee) {
		Session session = sessionFactory.openSession();
		session.save(employee);//persist hibernate
		System.out.println("Record Inserted");
		session.close();
	}
	
	
	public List<Employee> getEmployee() 
	{
		//get the hibernate session
		Session session = sessionFactory.openSession();
		//create a query.. sort by lastName
	//sorting the record by name 	
		Query theQuery = session.createQuery("from t_mas_employee_kttemp order by Name");
		List<Employee> e1 = theQuery.list();
		return e1;
	}

}
