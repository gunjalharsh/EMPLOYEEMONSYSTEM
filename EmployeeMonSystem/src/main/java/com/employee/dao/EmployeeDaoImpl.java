package com.employee.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.employee.model.Employee;

import entities.Drug;

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
		
	//sorting the record by name 	  
		Query theQuery = session.createQuery("from Employee order by tme_emp_project_name");
		List<Employee> e1 = theQuery.list();
		return e1;
	}
	public void deleteEmp(String theId)
	{
		Session session = sessionFactory.openSession();
		//:abc runtime variable
		Query theQuery = session.createQuery("delete from Employee where id=:abc");
		theQuery.setParameter("abc", theId);
		theQuery.executeUpdate();
	}

	public void updateSalary( int id, String name, String project_name, String salary){
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Query upd = session.createQuery("update Employee set tme_emp_name=:name, tme_emp_project_name=:project_name, tme_salary=:salary where tme_emp_id=:id");
		upd.setParameter("id", id);
		upd.setParameter("name", name);
		upd.setParameter("cost", project_name);
		upd.setParameter("desc", salary);
		upd.executeUpdate();
		session.getTransaction().commit();
		session.close();
	}  
	/*
	public Employee updateEmployee(Employee employee) {
        sessionFactory.getCurrentSession().update(employee);
        return employee;
    }
	public Employee getEmployee(int employeeId) {
        return (Employee) sessionFactory.getCurrentSession().get(
                Employee.class, employeeId);
    }  */
	
	@SuppressWarnings("unchecked")
	public List<Employee> searchEmployee(String name){
		Session session = sessionFactory.openSession();
		Query q=session.createQuery("from Employee where tme_emp_name=:name");
		q.setString("name", name);
		List<Employee> drugList = q.list();
		session.close();
		return employeeList;
	}
}
