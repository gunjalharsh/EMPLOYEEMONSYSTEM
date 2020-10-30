package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.employee.model.Employee;
import com.employee.service.employeeServiceImpl;

@Controller
public class EmployeeController {
	@Autowired
	private employeeServiceImpl employeeService1;
	
	
	@RequestMapping("callproj")
	public String createUser1(Model m) 
	{	
		//employee attribute==modelattribute in register.jsp
		m.addAttribute("employee",new Employee());
		return "register";//register.jsp==form action=register
	}
	
	
	//insertion
			@RequestMapping(value = "register", method = RequestMethod.POST)
			public String createUser( @Validated @ModelAttribute Employee employee1,BindingResult br, Model m)
			{
				if(br.hasErrors())  
		        {  
		            return "register";  
		        } else { 
				employeeService1.createEmployee(employee1);
				// return "redirect:/view"; //redirect to request pattern::view
				 return "redirect:/view";
			     }
			}

			
			@RequestMapping(value = "view", method = RequestMethod.GET)
			public String view(@ModelAttribute Employee employee1,Model m)
			{
				List<Employee> obj=employeeService1.getemp();
				m.addAttribute("emp",obj);
					return "ViewEmp";//ViewEmp.jsp
			}
}
