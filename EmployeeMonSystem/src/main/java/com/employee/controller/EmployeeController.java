package com.employee.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.employee.model.Employee;
import com.employee.service.employeeServiceImpl;

import entities.Drug;


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
					return "ViewCust";//ViewCust.jsp
			}
			
			@RequestMapping(value = "views", method = RequestMethod.GET)
			public String view1(@ModelAttribute Employee employee1,Model m)
			{
				List<Employee> obj=employeeService1.getemp();
				m.addAttribute("emp",obj);
					return "salary-emp" ;
			}
			
			
			//deletion
		    @RequestMapping(value="/deleteemp/{delno}",method = RequestMethod.GET)    
		    public String delemp(
		    		@PathVariable 
		    		String delno)
		    {    
		    	employeeService1.deleteemp(delno);
		        return "redirect:/view"; //call req pattern /view
		    } 
	    
		  //Update
			@RequestMapping("/updateSalary/{id}")
			public String updateSalary(Model m, @PathVariable("id") int id, Employee e){
				m.addAttribute("tme_emp_id",id);
				m.addAttribute("upd", e);
				return "update-salary";
			}
			
			@RequestMapping(value = "/updatesalary", method = RequestMethod.GET)
			public String updateSalary(@RequestParam("tme_emp_id")int id, @RequestParam("tme_emp_name")String name, @RequestParam("tme_emp_project_id")String project_name, @RequestParam("tme_salary")String salary){
				employeeService1.updateSalary(id, name, project_name, salary);
				return "redirect:/views";
			}
			
		    
	/*	    @RequestMapping(value = "/editEmployee", method = RequestMethod.GET)
		    public ModelAndView editContact(HttpServletRequest request) {
		        int employeeId = Integer.parseInt(request.getParameter("tme_emp_id"));
		    
		    //	String employeeId = Integer(request.getParameter("tme_emp_id")).toString();
		        Employee employee = employeeService1.getEmployee(employeeId);
	  
		        ModelAndView model = new ModelAndView("EmployeeForm");
		        model.addObject("employee", employee);
		 
		        return model;
		    }  */
		    
		//Search
			
			@RequestMapping("/search")
			public String search(Model m){
				m.addAttribute("employee", new Employee());
				return "search";
			}
			
			@RequestMapping(value="/searchRes", method=RequestMethod.POST)
			public String searchEmployee(@ModelAttribute("employee")Employee e, Model m){
				List<Employee> searched=employeeSer.searchEmployee(e.gettme_emp_name());
				m.addAttribute("employeeres", searched);
				return "searchRes";
			}


	
}
