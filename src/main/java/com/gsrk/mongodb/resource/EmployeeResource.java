package com.gsrk.mongodb.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.gsrk.mongodb.model.Employee;
import com.gsrk.mongodb.service.EmployeeService;

@RestController
@RequestMapping(value="/emp/")
public class EmployeeResource {
	
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(method=RequestMethod.GET,value="/all")
	@ResponseBody
	List<Employee> findAll(){
		return employeeService.findAll();
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/test")
	@ResponseBody
	Employee testURL(){
		System.out.println("test is invoked");
		//return employeeService.findAll();
		return new Employee("123", "Siva", "Krishna", 123000l);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/create")
	@ResponseBody
	Employee addEmployee(@RequestBody Employee emp){
		System.out.println("add user is invoked");
		return employeeService.addEmployee(emp);
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/find/{id}")
	@ResponseBody
	Employee findEmployeeById(@PathVariable("id") String employeeId){
		System.out.println("find employee is invoked");
		return employeeService.findEmployeeById(employeeId);
	}
	

}
