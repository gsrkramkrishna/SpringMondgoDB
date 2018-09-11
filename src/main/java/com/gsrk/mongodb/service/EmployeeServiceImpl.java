package com.gsrk.mongodb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gsrk.mongodb.model.Employee;
import com.gsrk.mongodb.repository.EmployeeRepository;

@Transactional
@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository repository;
	
	public Employee findEmployeeById(String id) {
		// TODO Auto-generated method stub
		return repository.findEmployeeById(id);
	}

	public List<Employee> findEmployeesByFirstName(String firstName) {
		// TODO Auto-generated method stub
		return repository.findEmployeeByFirstName(firstName);
	}

	public List<Employee> findEmployeesByLastName(String lastName) {
		// TODO Auto-generated method stub
		return repository.findEmployeeByLastName(lastName);
	}

	public List<Employee> findEmployeesBySalary(Long salary) {
		// TODO Auto-generated method stub
		return repository.findEmployeeBySalary(salary);
	}

	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Employee addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return repository.save(emp);
	}

}
