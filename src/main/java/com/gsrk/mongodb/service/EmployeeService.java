package com.gsrk.mongodb.service;

import java.util.List;

import com.gsrk.mongodb.model.Employee;

public interface EmployeeService {
	
	Employee findEmployeeById(String id);
	List<Employee> findEmployeesByFirstName(String firstName);
	List<Employee> findEmployeesByLastName(String lastName);
	List<Employee> findEmployeesBySalary(Long salary);
	List<Employee> findAll();
	Employee addEmployee(Employee emp);
}
