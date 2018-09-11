package com.gsrk.mongodb.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.gsrk.mongodb.model.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String>{
	Employee findEmployeeById(String id);
	List<Employee> findEmployeeByFirstName(String firstName);
	List<Employee> findEmployeeByLastName(String lastName);
	List<Employee> findEmployeeBySalary(Long salary);
}
