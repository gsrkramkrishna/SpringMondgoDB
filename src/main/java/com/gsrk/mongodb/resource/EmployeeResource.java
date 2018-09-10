package com.gsrk.mongodb.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gsrk.mongodb.model.Employee;
import com.gsrk.mongodb.service.EmployeeService;

@Controller
@RequestMapping("/emp")
public class EmployeeResource {
	
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(method=RequestMethod.GET,name="/all")
	List<Employee> findAll(){
		return employeeService.findAll();
	}
	

}
