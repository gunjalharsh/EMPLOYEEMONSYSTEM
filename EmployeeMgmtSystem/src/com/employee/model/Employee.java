package com.employee.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@SuppressWarnings("deprecation")
@Entity
@Table(name = "t_mas_employee_kttemp")

public class Employee {
	
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private String tme_emp_id;
	
	@SuppressWarnings("deprecation")
	@Column 
	@NotEmpty(message = "Please enter your name") 
	private String tme_emp_name;
	
	@Column 
	@NotEmpty(message = "Please enter Project name")
	private String tme_emp_project_name;
	
	@Column 
	@NotEmpty(message = "Please enter your Date of Joining")
	private String tme_DOJ;
	
	@Column 
	@NotEmpty(message = "Please enter your Date of Birth")
	private String tme_DOB;
	
	@Column 
	@NotEmpty(message = "Please enter your Salary")
	private String tme_Salary;
	
	@Column 
	@NotEmpty(message = "Please enter your Role ID")
	private String tme_role_id;

	public String getTme_emp_id() {
		return tme_emp_id;
	}

	public void setTme_emp_id(String tme_emp_id) {
		this.tme_emp_id = tme_emp_id;
	}

	public String getTme_emp_name() {
		return tme_emp_name;
	}

	public void setTme_emp_name(String tme_emp_name) {
		this.tme_emp_name = tme_emp_name;
	}

	public String getTme_emp_project_name() {
		return tme_emp_project_name;
	}

	public void setTme_emp_project_name(String tme_emp_project_name) {
		this.tme_emp_project_name = tme_emp_project_name;
	}

	public String getTme_DOJ() {
		return tme_DOJ;
	}

	public void setTme_DOJ(String tme_DOJ) {
		this.tme_DOJ = tme_DOJ;
	}

	public String getTme_DOB() {
		return tme_DOB;
	}

	public void setTme_DOB(String tme_DOB) {
		this.tme_DOB = tme_DOB;
	}

	public String getTme_Salary() {
		return tme_Salary;
	}

	public void setTme_Salary(String tme_Salary) {
		this.tme_Salary = tme_Salary;
	}

	public String getTme_role_id() {
		return tme_role_id;
	}

	public void setTme_role_id(String tme_role_id) {
		this.tme_role_id = tme_role_id;
	}
	
	

}
